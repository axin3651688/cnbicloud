package com.cnbicloud.config;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import javax.annotation.Resource;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.buffer.SimpleBufferAllocator;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.filter.logging.MdcInjectionFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cnbicloud.bean.Mina;
/**
 * 
* @ClassName: SocketConfigration  
* @Description: TODO(客户端连接配制管理类)  
* @author 龚佳新 
* @date 2017年11月14日  
*
 */
@Configuration
public class MinaSocketConfig {

	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MinaSocketConfig.class);

	//@Inject
	@Resource
	private Mina mina;
		
    
	/**
	 * 
	* @Title: tcpSocket  
	* @Description: TODO(配制Mina启动类，发送数据协议为：00 00 00 0B AC ED 00 05 74 00 04 31 31 31 32==>[前4位为数据长度，后7位为根据数据长度生成的协议标识符，从第12位开始到结尾就是发送的数据内容了])  
	* @param @return    参数  
	* @return IoAcceptor    返回类型  
	* @throws
	 */
	@Bean(name = "minaSocket")
	public IoAcceptor tcpSocket(){
		if(mina.getStart() == 0){
			return null;//由于测试作用，不启动的情况 
		}
		long a = System.currentTimeMillis();
	    IoBuffer.setUseDirectBuffer(false);//heap buffer
	    IoBuffer.setAllocator(new SimpleBufferAllocator());
		
		
		NioSocketAcceptor acceptor = new NioSocketAcceptor();
		acceptor.setReuseAddress(true);

	

		InetSocketAddress inetAddress = new InetSocketAddress(mina.getPort());

		DefaultIoFilterChainBuilder filterChain = acceptor.getFilterChain();

		filterChain.addLast("logger", new LoggingFilter());// 添加日志过滤器
		
		int readBufferSize = mina.getReadBufferSize();
		ObjectSerializationCodecFactory factory = new ObjectSerializationCodecFactory();
	    factory.setDecoderMaxObjectSize(readBufferSize);//
		factory.setEncoderMaxObjectSize(readBufferSize);


		
		//filterChain.addLast("codec", new Ic9ProtocolCodecFilter(factory));// 加解码对象过滤器
		filterChain.addLast("codec", new ProtocolCodecFilter(factory));// 加解码对象过滤器

		filterChain.addLast("executor", new ExecutorFilter());// 多线程处理 过滤器
	
		filterChain.addLast("threadPool", new ExecutorFilter(Executors.newCachedThreadPool()));	// 此行代码能让你的程序整体性能提升10倍
		
		

		KeepAliveFilter keepAliveFilter = new KeepAliveFilter(new SocketKeepAliveMessageFactory(),IdleStatus.BOTH_IDLE);
		keepAliveFilter.setRequestInterval(mina.getInterval());// 心跳频率，默认60s
		keepAliveFilter.setRequestTimeout(mina.getHeartTimeout());// 心跳超时时间，默认30s
		keepAliveFilter.setForwardEvent(true);

		filterChain.addLast("keepAliveFilter",keepAliveFilter);// 心跳过滤器

		MdcInjectionFilter mdcFilter = new MdcInjectionFilter();
		filterChain.addLast("mdcInjectionFilter", mdcFilter);// 在多描述编码(MDC，Multiple
																// Description
																// Coding)中注入IoSession的key属性

		acceptor.setHandler(new MinaSocketHandler());//消息处理
		acceptor.getSessionConfig().setReadBufferSize(readBufferSize);
		acceptor.getSessionConfig().setReceiveBufferSize(readBufferSize);
		acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, mina.getSessionIdleTime());
		try{
			acceptor.bind(inetAddress);
			logger.info("Ic9平台socket服务器在TCP端口【"+mina.getPort()+"】上成功启动，历时【" + (System.currentTimeMillis() - a) + "】毫秒！");
		}catch(Exception e){
			e.printStackTrace();
			logger.error("socket服务在TCP端口【"+mina.getPort()+"】上启动失败！", e);
		}
		return acceptor;
	}
	

}
