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
	
	
	private  static Map<String,String> USER_MAP = new HashMap<String,String>();
	
	static {
		USER_MAP.put(PROVIDER_USER,PROVIDER_PWD);
		USER_MAP.put("admin", PROVIDER_PWD);
		USER_MAP.put("cnbigjx", PROVIDER_PWD);
		USER_MAP.put("cnbilgl", PROVIDER_PWD);
		USER_MAP.put("cnbilhj", PROVIDER_PWD);
		
	}
	
	public static Map<String,String> getUserMap() {
		return USER_MAP;
	}

}
