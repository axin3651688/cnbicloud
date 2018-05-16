package com.cnbicloud.rest;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.config.InfoConfig;

@RestController
public class InfoClientRest {	
	
	@Resource
	private InfoConfig infoConfig;

	@RequestMapping("/config")
	//@ResponseBody
	public String getConfig() {
		return "108:"+infoConfig.toString();
	}}
