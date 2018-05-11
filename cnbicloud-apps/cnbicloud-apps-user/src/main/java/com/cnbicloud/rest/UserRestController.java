package com.cnbicloud.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.api.core.T_User;
import com.cnbicloud.service.IUserClientService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RequestMapping("/api")
@RestController
public class UserRestController {
	
	@Autowired
	private IUserClientService service;
	//api/user/get?
	@ResponseBody
	@HystrixCommand(fallbackMethod="getFallback")	// 如果当前调用的get()方法出现了错误，则执行fallback
	@GetMapping("/user/get")
	public T_User get(@RequestParam("username")String username){
		T_User user = service.find(username);
		return user;
	}
	public T_User getFallback(@RequestParam("username")String username) {	// 此时方法的参数 与get()一致
		T_User vo = new T_User() ;
		vo.setUsername(username+"getFallback");
		vo.setTrueName("【ERROR】Microcloud-Dept-Hystrix");	// 错误的提示
		return vo ;
	}
	@ResponseBody
	@GetMapping("/user/save")
	public T_User save(@RequestParam("phone")String phone,@RequestParam("password")String password){
		T_User user = service.save(phone,password);
		return user;
	}

}
