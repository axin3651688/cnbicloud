package com.cnbicloud.config;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.mina.core.session.IoSession;
/**
 * 
* @ClassName: MinaSocketHandshake  
* @Description: TODO(通过握手识别设备)  
* @author 龚佳新 
* @date 2017年11月22日  
*
 */
public class MinaSocketHandshake {
	
	private static final String SUCCESS_MSG_INFO = "设备信息设置成功！";
	
	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MinaSocketHandshake.class);
	/**
	 * 握手时设备嗅探
	 * @param session
	 * @param msg
	 * @return
	 */
	public synchronized static Map<String, Object> detectPlatform(IoSession session,Map<String,Object> map) {
		try {
			Set<String> set = map.keySet();
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				if (!key.equalsIgnoreCase("type")) {
					session.setAttribute(key, map.get(key));
				}
			}
			map.put("code", 200);
			map.put("msg", SUCCESS_MSG_INFO);
			return map;
		} catch (Exception e) {
			logger.error("握手时设备嗅探出错了:",e);
			return map;
		}

	}

}
