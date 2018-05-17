package com.cnbicloud.tools;


import java.net.InetAddress;

/**
 * 
 * @author 龚佳新
 *
 * @date 2014年4月10日下午5:57:06
 */
public class UUIDGenerator {
	
	private static final String PREFIX = "00000000";

	
	public static String generate(String prefix,String ip,String jvm,String time) {
		StringBuilder builder = new StringBuilder(32);
		int iip = toInt(ip.getBytes());
		builder.append(format(iip,prefix));
		return builder.toString();
	}
	
	/**
	 * 产生一个32位的UUID
	 * ip + jvm + currentTime + count
	 * 
	 * @return
	 */

	public static String generate(String prefix) {
		prefix = (prefix == null || prefix.length() < 8) ? PREFIX:prefix;
		String half = prefix.substring(0, 4);
		String hiTime = format(getHiTime(),half);
		String count = format(getCount(),half);
		return new StringBuilder(32).append(format(getIP(),prefix)).append(
				format(getJVM(),prefix)).append(hiTime).append(
				format(getLoTime(),prefix)).append(count).toString();
		
	}
	
	public static String generate() {
		return generate(PREFIX);
	}

	private static final int IP;
	static {
		int ipadd = 0;
		try {
			ipadd = toInt(InetAddress.getLocalHost().getAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
		IP = ipadd;
	}

	private static short counter = (short) 0;

	private static final int JVM = (int) (System.currentTimeMillis() >>> 8);

	private final static String format(int intval,String prefix) {
		String formatted = Integer.toHexString(intval);
		StringBuilder buf = new StringBuilder(PREFIX);
		buf.replace(8 - formatted.length(), 8, formatted);
		return buf.toString();
	}

	private final static String format(short shortval,String prefix) {
		String formatted = Integer.toHexString(shortval);
		StringBuilder buf = new StringBuilder(prefix);
		buf.replace(4 - formatted.length(), 4, formatted);
		return buf.toString();
	}

	private final static int getJVM() {
		return JVM;
	}

	private final static short getCount() {
		synchronized (UUIDGenerator.class) {
			if (counter < 0)
				counter = 0;
			return counter++;
		}
	}

	/**
	 * Unique in a local network
	 */
	private final static int getIP() {
		return IP;
	}

	/**
	 * Unique down to millisecond  独特到毫秒
	 */
	private final static short getHiTime() {
		return (short) (System.currentTimeMillis() >>> 32);
	}

	private final static int getLoTime() {
		return (int) System.currentTimeMillis();
	}

	private final static int toInt(byte[] bytes) {
		int result = 0;
		for (int i = 0; i < 4; i++) {
			result = (result << 8) - Byte.MIN_VALUE + (int) bytes[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = UUIDGenerator.generate();
		System.out.println(str.length()+"===>"+str);
	}

}
