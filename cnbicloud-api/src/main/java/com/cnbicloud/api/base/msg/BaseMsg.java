package com.cnbicloud.api.base.msg;
import java.io.Serializable;
/**
 * 消息基类
 * @Company 中国经邦
 * @Author 龚佳新
 * @Time 2016年8月26日上午9:22:26
 */
public class BaseMsg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	// @GenericGenerator(strategy="uuid", name = "system-uuid")
	// @GeneratedValue(generator="system-uuid")
	public String id;

	/**
	 * @Lob 持久化为Blob或者Clob类型,根据get方法的返回值不同,自动进行Clob和Blob的转换 类型的数据一般占用的内存空间比较大，所以通常使用延迟加载的方式，与@Basic标记同时使用，设置加载方式为FetchType.LAZY
	 */
	public String content;
	/**
	 * 时间
	 */
	// @JsonSerialize(using=DateSerializer.class)//指定自定义的json转换器
	public Long sendTime;

	/**
	 * 是否已推送
	 */
	public int state;
		
	/**
	 * 发送人
	 */
	public Long senderId;

	/**
	 * 可投递性时间的先后顺序
	 */
	public Long seq;

	/**
	 * 接收人查看次数，要不要把发送都浏览次数也加起来可以商榷一下
	 */
	public Short viewCount;
	

    /**
     *  单聊接收的人：
     *  接收组的Id:
     *  接收的应用：
     */
	private Long receiver;


	public Long getReceiver() {
		return receiver;
	}


	public void setReceiver(Long receiver) {
		this.receiver = receiver;
	}

	public BaseMsg() {}
	
	

	

	
	public BaseMsg(String id, String content, Long sendTime, int state, Long senderId, Long seq, Short viewCount, Long receiver) {
		super();
		this.id = id;
		this.content = content;
		this.sendTime = sendTime;
		this.state = state;
		this.senderId = senderId;
		this.seq = seq;
		this.viewCount = viewCount;
		this.receiver = receiver;
	}


	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}






	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public Short getViewCount() {
		return viewCount;
	}

	public void setViewCount(Short viewCount) {
		this.viewCount = viewCount;
	}

	

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

	public Long getSendTime() {
		return sendTime;
	}

	public void setSendTime(Long sendTime) {
		this.sendTime = sendTime;
	}

	

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public long getSeq() {
		return seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

}
