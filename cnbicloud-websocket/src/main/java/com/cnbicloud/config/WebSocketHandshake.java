package com.cnbicloud.config;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
 * 
 * @ClassName: WebSocketHandshakeInterceptor
 * @Description: TODO(Web端连接时的握手行为)
 * @author 龚佳新
 * @date 2017年11月14日
 *
 */
public class WebSocketHandshake extends HttpSessionHandshakeInterceptor {

	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WebSocketHandshake.class);
	
	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception ex) {
		logger.info("afterHandshake");
		super.afterHandshake(request, response, wsHandler, ex);
	}
	//@EventListener
	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> params) throws Exception {
		//TODO Auto-generated method stub
		//WebSocketTraceChannelInterceptorAutoConfiguration
		//MessageMappingEndpoint
		//WebSocketEndpoint
		return super.beforeHandshake(request, response, wsHandler, params);
	}

}
