package com.cnbicloud.rest;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.bean.MsgBean;
import com.cnbicloud.service.LogService;
import com.cnbicloud.vo.Log_Login;
/**
 * 
* @ClassName: LoginLogRestController  
* @Description: TODO(登录日志的操作处理)    /api/loginLog/findByCreateUser?userId=1
* @author 龚佳新 
* @date 2018年6月21日  
*
 */
@RestController
@RequestMapping("/api")
public class LoginLogRestController {

	@Autowired
	private LogService logService;

	@PostMapping("/loginLog/save")
	public MsgBean save(@RequestBody Log_Login loginLog) {
		loginLog =  logService.save(loginLog);
		return new MsgBean(200,"保存日志成功",loginLog);
	}
	
	@PutMapping("/loginLog/update")
	public MsgBean update(@RequestBody Log_Login loginLog) {
		return null;
	}
	
	@Delete("/loginLog/delete")
	public MsgBean delete() {
		return null;
	}
	
	@GetMapping("/loginLog/findByCreateUser")
	public Object findByCreateUser(@RequestParam("userId")Long userId) {
		List<Log_Login> logs = logService.findByCreateUser(userId);
		return logs;
	
	}

}
