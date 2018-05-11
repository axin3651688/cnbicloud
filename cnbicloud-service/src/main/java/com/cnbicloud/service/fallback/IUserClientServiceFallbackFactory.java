package com.cnbicloud.service.fallback;

import org.springframework.stereotype.Component;

import com.cnbicloud.api.core.T_User;
import com.cnbicloud.service.IUserClientService;
import feign.hystrix.FallbackFactory;

@Component
public class IUserClientServiceFallbackFactory implements FallbackFactory<IUserClientService> {

	@Override
	public IUserClientService create(Throwable cause) {
		return new IUserClientService() {

			@Override
			public T_User find(String username) {
				T_User vo = new T_User();
				vo.setUsername(username);
				vo.setTrueName("Consumer客户端提供");
				return vo;
			}

			@Override
			public T_User save(String phone, String password) {
				T_User vo = new T_User();
				vo.setUsername(phone);
				vo.setPassword(password);
				vo.setTrueName("Consumer客户端提供");
				return null;
			}
		};
	}

}
