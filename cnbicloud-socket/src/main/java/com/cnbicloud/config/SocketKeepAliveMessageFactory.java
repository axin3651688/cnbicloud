package com.cnbicloud.config;
import org.apache.log4j.Logger;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.keepalive.KeepAliveMessageFactory;
/**
 * 
 * @desc 心跳过滤器
 * @author 龚佳新
 * @time:2016年12月11日 下午12:21:49
 *
 */
public class SocketKeepAliveMessageFactory implements KeepAliveMessageFactory {

	private final Logger LOG = Logger.getLogger(SocketKeepAliveMessageFactory.class);
	
	private int requestCount = 0 ;
	
	private int responseCount = 0 ;

	/** 心跳包内容 */
	public static final String HEARTBEATREQUEST = "1111";
	
	/**
	 * 心跳包 response
	 */
	public static final String HEARTBEATRESPONSE = "1112";

	public Object getRequest(IoSession session) {
		LOG.warn("请求预设"+session.getAttribute("ip")+"--"+session.getAttribute("device")+"==>信息: " + HEARTBEATREQUEST);
		/** 返回预设语句 */
		return HEARTBEATREQUEST;
	}

	public Object getResponse(IoSession session, Object request) {
		LOG.warn("响应预设"+session.getAttribute("ip")+"--"+session.getAttribute("device")+"==>信息: " + HEARTBEATRESPONSE);
		/** 返回预设语句 */
		return HEARTBEATRESPONSE;
		// return null;
	}

	public boolean isRequest(IoSession session, Object message) {
		if(message instanceof String){
			if(message.equals(HEARTBEATREQUEST)){
				requestCount++;
				LOG.warn("请求心跳包"+session.getAttribute("ip")+"--"+session.getAttribute("device")+"==>第【"+requestCount+"】信息: " + message);
				return true;
			}
		}	
		return false;

	}

	public boolean isResponse(IoSession session, Object message) {
		if(message instanceof String){
			if (message.equals(HEARTBEATRESPONSE)){
				responseCount++;
				LOG.warn(session.getAttribute("brand")+"==>"+session.getAttribute("device")+"第【"+responseCount+"】次响应心跳包信息: " + message);
				return true;
			}
		}
		return false;
	}

}
