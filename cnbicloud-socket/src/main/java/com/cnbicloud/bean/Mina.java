package com.cnbicloud.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
* @ClassName: Mina  
* @Description: TODO(Mina服务器配制类)  
* @author 龚佳新 
* @date 2017年11月22日  
*
 */
@Component      //不加这个注解的话, 使用@Autowired 就不能注入进去了
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "mina", ignoreUnknownFields = true)
public class Mina {
	private int port = 8889;

	private String ip = "localhost";

	private int readBufferSize = 4096 * 10;// 读取缓冲大小

	private int receiveBufferSize = 4096 * 10;// 读取缓冲大小如果没有设置过，那么这个值默认是64K

	private int sessionIdleTime = 25;// 进入空闲的时候

	private int interval = 60;// 心跳频率，默认60s

	private int heartTimeout = 30;// 心跳超时时间，默认30s

	private int start = 0;
	
	private int maxThreads = 100;
	
	
	private int processorCount = 8;
	
	private int socketIoPool = 512;
	
	

	public int getPort() {
		return port;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getInterval() {
		return interval;
	}

	public void setInterval(int interval) {
		this.interval = interval;
	}

	public int getHeartTimeout() {
		return heartTimeout;
	}

	public void setHeartTimeout(int heartTimeout) {
		this.heartTimeout = heartTimeout;
	}

	public void setReadBufferSize(int readBufferSize) {
		this.readBufferSize = readBufferSize;
	}

	public void setSessionIdleTime(int sessionIdleTime) {
		this.sessionIdleTime = sessionIdleTime;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public int getReadBufferSize() {
		return readBufferSize;
	}

	public int getSessionIdleTime() {
		return sessionIdleTime;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getReceiveBufferSize() {
		return receiveBufferSize;
	}

	public void setReceiveBufferSize(int receiveBufferSize) {
		this.receiveBufferSize = receiveBufferSize;
	}

	public int getMaxThreads() {
		return maxThreads;
	}

	public void setMaxThreads(int maxThreads) {
		this.maxThreads = maxThreads;
	}

	public int getProcessorCount() {
		return processorCount;
	}

	public void setProcessorCount(int processorCount) {
		this.processorCount = processorCount;
	}

	public int getSocketIoPool() {
		return socketIoPool;
	}

	public void setSocketIoPool(int socketIoPool) {
		this.socketIoPool = socketIoPool;
	}
	
	

}