package com.cnbicloud.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cnbicloud.dao.ILogDao;
import com.cnbicloud.vo.log.Log_Login;

@Service
public class LogService {
	
	private ILogDao logDao;
	
	public Page<Log_Login> findPageByCreateUser(Long userId){
		return logDao.findPageByCreateUser(userId);
		
	}

}
