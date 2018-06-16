package com.cnbicloud.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.cnbicloud.LogApplication;
import com.cnbicloud.dao.ILogDao;
import com.cnbicloud.vo.log.Log_Login;

import java.util.List;

import org.junit.*;
import org.junit.runner.RunWith;

//@org.junit.runner.RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(LogApplication.class)
@RunWith(SpringRunner.class) //14.版本之前用的是SpringJUnit4ClassRunner.class 
@SpringBootTest(classes = LogApplication.class)
public class SpringbootJdbcDemoApplicationTests {
	@Autowired
	private ILogDao dao;

	@org.junit.Test
	public void findLogs() {
		List<Log_Login> logs = dao.findAll();
		Assert.assertNotNull(logs);
		Assert.assertTrue(!logs.isEmpty());
	}
	
	@Test
	public void findLogsByCreateUser() {
		List<Log_Login> logs = dao.findByCreateUser(1l);
		Assert.assertNotNull(logs);
	}

}
