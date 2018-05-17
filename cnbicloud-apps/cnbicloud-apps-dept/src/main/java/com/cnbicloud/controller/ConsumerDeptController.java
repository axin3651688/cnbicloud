package com.cnbicloud.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.service.IDeptClientService;
import com.cnbicloud.vo.Dept;
@RestController
@RequestMapping("/api")
public class ConsumerDeptController {
	
	@Resource
	private IDeptClientService deptService;

	/*public Object getFallback(@PathVariable("id") long id) { // 此时方法的参数 与get()一致
		Dept vo = new Dept();
		vo.setDeptno(999999L);
		vo.setDname("【ERROR】cnbicloud-Dept-Hystrix"); // 错误的提示
		vo.setLoc("DEPT-Provider");
		return vo;
	}*/
    /**
    * @Title: getDept  
    * @Description: TODO(这里用一句话描述这个方法的作用)  
    * @param @param id
    * @param @return    参数  
    * @return Object    返回类型  
    * @throws
     */
	//@HystrixCommand(fallbackMethod = "getFallback") // 如果当前调用的get()方法出现了错误，则执行fallback
	@RequestMapping(value = "/dept/get")
	public Object getDept(long id) {
		return this.deptService.get(id);
	}

	@RequestMapping(value = "/dept/list")
	public Object listDept() {
		return this.deptService.list();
	}

	@RequestMapping(value = "/dept/add")
	public Object addDept(Dept dept) throws Exception {
		dept.setDeptno(90l);
		dept.setDname("测试");
		dept.setLoc("8001");
		//ConfigClusterResolver
		return this.deptService.add(dept);
	}
}
