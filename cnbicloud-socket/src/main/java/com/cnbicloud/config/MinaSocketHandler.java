package com.cnbicloud.config;
import java.net.InetSocketAddress;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
/**
 * 功能：消息收发处理   
 * @desc TODO
 * @author 龚佳新
 * @time:2016年12月10日 上午9:41:47     StreamIoHandler  IoHandlerAdapter
 *  mina API:https://www.ibm.com/developerworks/cn/java/j-lo-mina2/index.html
 */
public class MinaSocketHandler extends IoHandlerAdapter {
	
	private static boolean SHAKE  =  false;



	private final org.slf4j.Logger logger =  org.slf4j.LoggerFactory.getLogger(MinaSocketHandler.class);
	
	//public static final CharsetDecoder decoder = (Charset.forName("UTF-8")).newDecoder();
    /**
     * test  : 74 65 73 74
     * a:
     */
	@Override
	public void exceptionCaught(IoSession session, Throwable cause) {
		logger.warn("客户瑞【"+session.getAttribute("ip")+"】会话【"+session.getId()+"】发生了异常：\n" + cause.getMessage());
		cause.printStackTrace();//session.closeOnFlush();
	}

	@Override
	public void messageReceived(IoSession session, Object message) {
		String msg = String.valueOf(message);
		if(msg.length() > 6) {
			Object shake = session.getAttribute(SHAKE);
			if(null == shake) {
				MinaSocketHandshake.detectPlatform(session,null);
				session.setAttribute(SHAKE, 1);//表示已经握手的标识
			}else {
				
			}
		}
		//detectPlatform
	}
	@Override
	public void messageSent(IoSession session, Object message) throws Exception {}

    //@IoHandlerTransition
	@Override
	public void sessionCreated(IoSession session) throws Exception {
		String remoteAddress = ((InetSocketAddress) session.getRemoteAddress()).getAddress().getHostAddress();
		logger.warn("sessionCreated remote client [" + remoteAddress + "] connected.deviceId=="+session.getAttribute("device"));//logger.warn("sessionOpened."+session.getId()+"来了！！！"+ session.getAttribute("deviceId"));
		session.setAttribute("ip", remoteAddress);
	}
	
	
	private void printfMsg(IoSession session,String action){
		String username = (String) session.getAttribute("username");
		logger.warn(session.getId()+"===>"+username+"==>."+action);
	}

	@Override
	public void sessionClosed(IoSession session) throws Exception {}

	@Override
	public void sessionIdle(IoSession session, IdleStatus status) {
		printfMsg(session, "sessionIdle");
//		session.closeOnFlush();
//		logger.warn("disconnected.");
	}

	@Override
	public void sessionOpened(IoSession session){
		logger.warn("sessionOpened."+session.getId()+"来了！！！");
	}

}
