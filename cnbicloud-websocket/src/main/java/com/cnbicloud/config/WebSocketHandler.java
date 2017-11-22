package com.cnbicloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.PongMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.AbstractWebSocketHandler;

/**
 * 
 * @ClassName: WebSocketConfig
 * @Description: TODO(Web端接收消息处理类)
 * @author 龚佳新
 * @date 2017年11月14日
 *
 */
@Configuration
public class WebSocketHandler extends AbstractWebSocketHandler {

	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WebSocketHandler.class);

	/**
	 * 此连接关闭的动作
	 */
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		logger.info("此连接关闭的动作");
		super.afterConnectionClosed(session, status);
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		super.afterConnectionEstablished(session);
	}

	@Override
	protected void handleBinaryMessage(WebSocketSession session, BinaryMessage message) throws Exception {
		super.handleBinaryMessage(session, message);
	}

	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {

		super.handleMessage(session, message);
	}

	@Override
	protected void handlePongMessage(WebSocketSession session, PongMessage message) throws Exception {

		super.handlePongMessage(session, message);
	}

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

		super.handleTextMessage(session, message);
	}

	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {

		super.handleTransportError(session, exception);
	}

	@Override
	public boolean supportsPartialMessages() {

		return super.supportsPartialMessages();
	}

}
