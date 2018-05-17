package com.cnbicloud.tools;

import java.util.HashMap;
import java.util.Map;
/**
 * 
* @ClassName: CnbiConstants  
* @Description: TODO(基本常量)  
* @author 龚佳新 
* @date 2017年11月3日  
*
 */
public class CnbiConstants {
	
	
	public static final String PROVIDER_USER = "mldnjava";
	
	public static final String PROVIDER_PWD = "hello";
	
   public static final String EUREKA_USER = "edmin";
	
	public static final String EUREKA_PWD = PROVIDER_USER;
	
	private static String [] EUREKA_SERVERS = {"192.168.1.118:7001","192.168.1.108:7001"};
	
	public  static  String EUREKA_DEFAULT_ZONE = "http://edmin:mldnjava@192.168.1.118:7001/eureka,http://edmin:mldnjava@192.168.1.108:7001/eureka";
	
	
	private  static Map<String,String> USER_MAP = new HashMap<String,String>();
	
	static {
		USER_MAP.put(PROVIDER_USER,PROVIDER_PWD);
		USER_MAP.put("admin", PROVIDER_PWD);
		USER_MAP.put("cnbigjx", PROVIDER_PWD);
		USER_MAP.put("cnbilgl", PROVIDER_PWD);
		USER_MAP.put("cnbilhj", PROVIDER_PWD);
		StringBuffer servers = new StringBuffer();
		for (int i = 0,len = EUREKA_SERVERS.length; i <len; i++) {
			servers.append("http://"+EUREKA_USER+":"+EUREKA_PWD+"@"+EUREKA_SERVERS[i]+"/eureka");
			if(i != len - 1) {
				servers.append(",");
			}
		}
		EUREKA_DEFAULT_ZONE = servers.toString();
	}
	
	public static Map<String,String> getUserMap() {
		return USER_MAP;
	}

}
