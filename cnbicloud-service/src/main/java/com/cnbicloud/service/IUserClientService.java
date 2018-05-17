package com.cnbicloud.service;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cnbicloud.api.core.T_User;
import com.cnbicloud.commons.config.FeignClientConfig;
import com.cnbicloud.service.fallback.IUserClientServiceFallbackFactory;
/*import com.cnbicloud.vo.per.T_User;
*/@FeignClient(value = "CNBICLOUD-ZUUL-GATEWAY", configuration = FeignClientConfig.class, fallbackFactory = IUserClientServiceFallbackFactory.class)
public interface IUserClientService {
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/get")
	public T_User find(@RequestParam("username")String username);
	
	@PostMapping("/user/save")
	public T_User save(@RequestParam("phone")String phone,@RequestParam("password")String password);
}

