package com.cnbicloud.rest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cnbicloud.config.SecurityUtils;
import com.cnbicloud.service.IUserService;
import com.cnbicloud.vo.per.T_User;
/**
 * 
* @ClassName: RestController  
* @Description: TODO(用户Rest服务)  
* @author 龚佳新 
* @date 2017年12月18日  
*
 */
@Controller
public class UserRestController {
	
	@Autowired
	private IUserService  userService; 
	
	@ResponseBody
	@GetMapping("/findByUsername")
	public T_User select(HttpSession session,@RequestParam("username")String username){
		String usrname = SecurityUtils.getCurrentUserLogin();
		System.out.println(usrname);
		T_User user = userService.findByUsername(username);
		if(null == user) {
			user = new T_User();
			user.setUsername(username);
			user.setTrueName(session.getId());
		}
		return user;
	}

}
