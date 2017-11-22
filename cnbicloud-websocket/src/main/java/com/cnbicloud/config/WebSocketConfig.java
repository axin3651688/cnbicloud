package com.cnbicloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * 
 * @ClassName: WebSocketConfig
 * @Description: TODO(Web端双向通讯配制管理)
 * @author 龚佳新
 * @date 2017年11月14日
 *
 */
@Configuration
@EnableWebSocketMessageBroker
@EnableWebSocket
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer implements WebSocketConfigurer {

	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WebSocketConfig.class);

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic", "/user"); // 订阅Broker名称 消息订阅路径
		config.setApplicationDestinationPrefixes("/app");// 全局使用的订阅前缀（客户端订阅路径上会体现出来）
		// registry.setUserDestinationPrefix("/user/");//点对点使用的订阅前缀（客户端订阅路径上会体现出来），不设置的话，默认也是/user/
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry arg0) {
		logger.info("registerStompEndpoints");

	}

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry arg0) {
		// TODO Auto-generated method stub

	}

}
