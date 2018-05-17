package com.cnbicloud.rest;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.config.SecurityUtils;
import com.cnbicloud.service.IDeptService;
import com.cnbicloud.vo.Dept;
/**
 * 
 * @ClassName: DetpRestController
 * @Description: TODO(部门微服务api提供)
 * @author 龚佳新
 * @date 2017年10月31日
 */
@RestController
public class DetpRestController {

	@Inject
	private IDeptService deptService;

	/*public Object getFallback(@PathVariable("id") long id) { // 此时方法的参数 与get()一致
		Dept vo = new Dept();
		vo.setDeptno(999999L);
		vo.setDname("【ERROR】cnbicloud-Dept-Hystrix"); // 错误的提示
		vo.setLoc("DEPT-Provider");
		return vo;
	}
*/
	//@HystrixCommand(fallbackMethod = "getFallback") // 如果当前调用的get()方法出现了错误，则执行fallback
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
	@RequestMapping(value = "/getCurrentUser", method = RequestMethod.GET)
	public String getCurrentUser() {
		String username = SecurityUtils.getCurrentUserLogin();
		return username;
	}

}
