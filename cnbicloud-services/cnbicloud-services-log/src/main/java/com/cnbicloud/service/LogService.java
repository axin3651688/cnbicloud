package com.cnbicloud.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.cnbicloud.dao.ILogDao;
import com.cnbicloud.vo.log.Log_Login;

@Service
public class LogService {
	
	private ILogDao logDao;
	
	public List<Log_Login> findAll(){
		return logDao.findAll();
	}
	
	public List<Log_Login> findByCreateUser(Long userId){
		return logDao.findByCreateUser(userId);
	}

}
