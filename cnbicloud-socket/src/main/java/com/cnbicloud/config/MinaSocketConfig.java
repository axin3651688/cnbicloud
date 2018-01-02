package com.cnbicloud.config;
import java.net.InetSocketAddress;
import javax.annotation.Resource;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.buffer.SimpleBufferAllocator;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.cnbicloud.bean.Mina;
import com.cnbicloud.service.AsyncSocketService;
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
	* @param     参数  
	* @return IoAcceptor
	* @throws
	 */
	@Bean(name = "minaSocket")
	public AsyncSocketService tcpSocket(){
		if(mina.getStart() == 0){
			return null;//由于测试作用，不启动的情况 
		}
		long a = System.currentTimeMillis();
	    IoBuffer.setUseDirectBuffer(false);//heap buffer
	    IoBuffer.setAllocator(new SimpleBufferAllocator());//
		try{
			AsyncSocketService socketService = new AsyncSocketService(mina);
			InetSocketAddress inetAddress = new InetSocketAddress(mina.getPort());
			NioSocketAcceptor ioAcceptor = socketService.getIoAcceptor();
			ioAcceptor.bind(inetAddress);
			logger.info("Ic9平台socket服务器在TCP端口【"+mina.getPort()+"】上成功启动，历时【" + (System.currentTimeMillis() - a) + "】毫秒！");
			return socketService;
		}catch(Exception e){
			e.printStackTrace();
			logger.error("socket服务在TCP端口【"+mina.getPort()+"】上启动失败！", e);
		}
		return null;
	}
	

}
