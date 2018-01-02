package com.cnbicloud.config;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

/**
 * @ClassName: WebSocketConfig
 * @Description: TODO(Web端双向通讯配制管理)
 * @author 龚佳新
 * @date 2017年11月14日
 */
@Configuration
@EnableWebSocketMessageBroker
@EnableWebSocket
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer implements WebSocketConfigurer {

	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(WebSocketConfig.class);

	public static final String IP_ADDRESS = "IP_ADDRESS";

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		//AbstractSecurityWebSocketMessageBrokerConfigurer
		//SimpleBrokerMessageHandler
	}

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		logger.info("registerStompEndpoints");
		/*registry.addEndpoint("/websocket/tracker").setHandshakeHandler(new DefaultHandshakeHandler() {

			protected Principal determineUser(ServerHttpRequest request, WebSocketHandler wsHandler, Map<String, Object> attributes) {
				Principal principal = request.getPrincipal();
				if (principal == null) {
					Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
					authorities.add(new SimpleGrantedAuthority(AuthoritiesConstants.ANONYMOUS));
					principal = new AnonymousAuthenticationToken("WebsocketConfiguration", "anonymous", authorities);
				}
				return principal;
			}
		}).withSockJS().setInterceptors(httpSessionHandshakeInterceptor());
*/
	}

	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry arg0) {
		// TODO Auto-generated method stub

	}

	@Bean
	public HandshakeInterceptor httpSessionHandshakeInterceptor() {
		return new HandshakeInterceptor() {

			@Override
			public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, org.springframework.web.socket.WebSocketHandler wsHandler,
					Map<String, Object> attributes) throws Exception {
				return false;
			}

			@Override
			public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, org.springframework.web.socket.WebSocketHandler wsHandler,
					Exception exception) {
				// TODO Auto-generated method stub

			}
		};
	}

}
