package com.cnbicloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnbicloud.dao.ILogDao;
import com.cnbicloud.vo.Log_Login;
/**
 * 
* @ClassName: LogService  
* @Description: TODO(日志服务)  
* @author 龚佳新 
* @date 2018年6月21日  
*
 */
@Service
public class LogService {
	
	@Autowired
	private ILogDao logDao;
	
	
	public Log_Login save(Log_Login entity) {
		return logDao.save(entity);
	}
	
	public List<Log_Login> findAll(){
		return logDao.findAll();
	}
	
	public List<Log_Login> findByCreateUser(Long userId){
		return logDao.findByCreateUser(userId);
	}
	
	public Log_Login update(Log_Login entity) {
		return logDao.saveAndFlush(entity);
	}

}
