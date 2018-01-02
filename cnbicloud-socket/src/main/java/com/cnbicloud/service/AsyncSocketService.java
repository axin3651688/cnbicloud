package com.cnbicloud.service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.executor.ExecutorFilter;
import org.apache.mina.filter.keepalive.KeepAliveFilter;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.filter.logging.MdcInjectionFilter;
import org.apache.mina.transport.socket.SocketSessionConfig;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import com.cnbicloud.bean.Mina;
import com.cnbicloud.config.MinaSocketHandler;
import com.cnbicloud.config.SocketKeepAliveMessageFactory;
/**
 * @ClassName: AsyncSocketService
 * @Description: TODO(socket服务)
 * @author 龚佳新
 * @date 2017年12月4日
 */
public class AsyncSocketService {

	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(AsyncSocketService.class);

	private Mina config;
	
	private NioSocketAcceptor ioAcceptor;
	
	private ExecutorService executorService;

	public AsyncSocketService() {
		this.executorService = Executors.newCachedThreadPool();
	}

	public AsyncSocketService(Mina config) throws Exception {
		this();
		this.config = config;
		setIoAcceptor();
	}

	public void setIoAcceptor() throws Exception {
			this.ioAcceptor = new NioSocketAcceptor(this.config.getProcessorCount());
			this.ioAcceptor.setReuseAddress(true);
			DefaultIoFilterChainBuilder filterChain = ioAcceptor.getFilterChain();
			filterChain.addLast("logger", new LoggingFilter());// 添加日志过滤器
			int readBufferSize = this.config.getReadBufferSize();
			ObjectSerializationCodecFactory factory = new ObjectSerializationCodecFactory();
		    factory.setDecoderMaxObjectSize(readBufferSize);//
			factory.setEncoderMaxObjectSize(readBufferSize);
			filterChain.addLast("codec", new ProtocolCodecFilter(factory));// 加解码对象过滤器
			filterChain.addLast("executor", new ExecutorFilter(this.executorService));// 多线程处理 过滤器
			filterChain.addLast("threadPool", new ExecutorFilter());	// 此行代码能让你的程序整体性能提升10倍
			KeepAliveFilter keepAliveFilter = new KeepAliveFilter(new SocketKeepAliveMessageFactory(),IdleStatus.BOTH_IDLE);
			keepAliveFilter.setRequestInterval(this.config.getInterval());// 心跳频率，默认60s
			keepAliveFilter.setRequestTimeout(this.config.getHeartTimeout());// 心跳超时时间，默认30s
			keepAliveFilter.setForwardEvent(true);
			filterChain.addLast("keepAliveFilter",keepAliveFilter);// 心跳过滤器
			filterChain.addLast("mdcInjectionFilter", new MdcInjectionFilter());// 在多描述编码(MDC，Multiple Description Coding)中注入IoSession的key属性

			this.ioAcceptor.setHandler(new MinaSocketHandler());//消息处理
			SocketSessionConfig socketConfig = this.ioAcceptor.getSessionConfig();
			socketConfig.setReadBufferSize(readBufferSize);
			socketConfig.setReceiveBufferSize(readBufferSize);
			socketConfig.setIdleTime(IdleStatus.BOTH_IDLE, this.config.getSessionIdleTime());
	 }

	public void stop() {
		if (null != this.ioAcceptor) {
			this.ioAcceptor.unbind();
			this.ioAcceptor.dispose();
		}
		this.executorService.shutdown();
		logger.info("成功关闭端口："+this.config.getPort());
	}

	public Mina getConfig() {
		return config;
	}

	public void setConfig(Mina config) {
		this.config = config;
	}

	public NioSocketAcceptor getIoAcceptor() {
		return ioAcceptor;
	}

	
	
	

}
