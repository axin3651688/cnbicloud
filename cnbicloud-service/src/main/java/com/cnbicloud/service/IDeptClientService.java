package com.cnbicloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnbicloud.commons.config.FeignClientConfig;
import com.cnbicloud.service.fallback.IDeptClientServiceFallbackFactory;
import com.cnbicloud.vo.Dept;


@FeignClient(value = "CNBICLOUD-ZUUL-GATEWAY", configuration = FeignClientConfig.class, fallbackFactory = IDeptClientServiceFallbackFactory.class)
public interface IDeptClientService {
	@RequestMapping(method = RequestMethod.GET, value = "/dept/get/{id}")
	public Dept get(@PathVariable("id") long id);
	@RequestMapping(method = RequestMethod.GET, value = "/dept/list")
	public List<Dept> list();
	@RequestMapping(method = RequestMethod.POST, value = "/dept/add")
	public boolean add(Dept dept);
}

