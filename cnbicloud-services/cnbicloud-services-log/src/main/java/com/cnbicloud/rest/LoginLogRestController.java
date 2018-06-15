package com.cnbicloud.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.bean.MsgBean;
import com.cnbicloud.service.LogService;
import com.cnbicloud.vo.log.Log_Login;

@RestController
@RequestMapping("/api")
public class LoginLogRestController {

	@Autowired
	private LogService logService;

	@PostMapping("/loginLog/save")
	public MsgBean save() {
		return null;
	}
	
	@PutMapping("/loginLog/update")
	public MsgBean update() {
		return null;
	}
	
	@PutMapping("/loginLog/delete")
	public MsgBean delete() {
		return null;
	}
	
	@GetMapping("/loginLog/queryPage")
	public MsgBean queryPage(@RequestParam("userId")Long userId) {
		Page<Log_Login> page = logService.findPageByCreateUser(userId);
		return new MsgBean();
	}

}