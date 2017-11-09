package com.cnbicloud.rest;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.service.IDeptService;
import com.cnbicloud.vo.Dept;
/**
 * 
* @ClassName: DetpRestController  
* @Description: TODO(部门微服务api提供)  
* @author 龚佳新 
* @date 2017年10月31日  
*
 */
@RestController
public class DetpRestController {

	@Resource
	private IDeptService deptService;

	@RequestMapping("/dept/sessionId")
	public Object id(HttpServletRequest request) {
		return request.getSession().getId();
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Object get(@PathVariable("id") long id) {
		return this.deptService.get(id);
	}

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public Object add(@RequestBody Dept dept) {
		return this.deptService.add(dept);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public Object list() {
		return this.deptService.list();
	}

}
