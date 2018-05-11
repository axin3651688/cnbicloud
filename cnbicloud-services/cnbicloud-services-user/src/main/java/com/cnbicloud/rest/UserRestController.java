package com.cnbicloud.rest;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cnbicloud.config.SecurityUtils;
import com.cnbicloud.service.IUserService;
import com.cnbicloud.vo.T_User;
/**
* @ClassName: RestController  
* @Description: TODO(用户Rest服务)  
* @author 龚佳新 
* @date 2017年12月18日  
*/
@Controller
public class UserRestController {
	
	@Autowired
	private IUserService  userService; 
	
	@ResponseBody
	@GetMapping("/user/get")
	public T_User get(@RequestParam("username")String username){
		String login = SecurityUtils.getCurrentUserLogin();
		System.out.println("loginUsr is==>"+login);
		T_User user = userService.findByUsername(username);
		if(null == user){
			return new T_User(username, login);
		}
		return user;//
	}
	
	@ResponseBody
	@PostMapping("/user/save")
	public T_User save(@RequestParam("phone")String phone,@RequestParam("password")String password){
		String username = SecurityUtils.getCurrentUserLogin();
		T_User user = new T_User();
		user.setUsername(username);
		user.setAvatar("test");
		user.setTrueName(phone);
		user.setPassword(password);
		user.setPhone(phone);
		user.setBirthday(new Date());
		user.setEmail(phone+"@cnbisoft.com");
		user.setSign(username+phone);
		user = userService.save(user);
		return user;
	}

}
