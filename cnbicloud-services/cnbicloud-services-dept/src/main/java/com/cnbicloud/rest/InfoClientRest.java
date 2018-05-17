package com.cnbicloud.rest;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.cloud.config.environment.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cnbicloud.config.InfoConfig;

@RestController
public class InfoClientRest {
	@Resource
	private InfoConfig infoConfig;
	
	//@Inject
	//private org.springframework.cloud.config.environment.Environment env;
	
	@Inject
	private org.springframework.core.env.Environment envi;
    
	@RequestMapping("/config")
//	@ResponseBody
	public String getConfig() {
		/*String profiles [] = envi.getDefaultProfiles();
		for (String profile : profiles) {
			System.out.println("env=="+profile);
		}
		//System.out.println("=========info.version=="+envi.getProperty("info.version"));
		//System.out.println("=========spring.gjx=="+envi.getProperty("spring.gjx"));
		//System.out.println("=========spring.application.name=="+envi.getProperty("spring.application.name"));
		String iprofiles [] = envi.getActiveProfiles();
		for (String profile : iprofiles) {
			System.out.println("envi=="+profile);
		}*/
		String renewal = envi.getProperty("eureka.instance.lease-renewal-interval-in-seconds");
		System.out.println("renewal=="+renewal);
		return "118:"+infoConfig.toString();
	}
}
