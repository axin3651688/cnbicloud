package com.cnbicloud.vo.abs;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import com.cnbicloud.vo.per.T_User;
/**
 * 消息基类
 * @Company 中国经邦
 * @Author 龚佳新
 * @Time 2016年8月26日上午9:22:26
 */
@MappedSuperclass
public class BaseMsg implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 32)
	// @GenericGenerator(strategy="uuid", name = "system-uuid")
	// @GeneratedValue(generator="system-uuid")
	public String id;

	/**
	 * @Lob 持久化为Blob或者Clob类型,根据get方法的返回值不同,自动进行Clob和Blob的转换 类型的数据一般占用的内存空间比较大，所以通常使用延迟加载的方式，与@Basic标记同时使用，设置加载方式为FetchType.LAZY
	 */
	@Column(name = "stext", nullable = false)
	@Lob
	@Basic(fetch = FetchType.LAZY)
	public String content;
	/**
	 * 时间
	 */
	@Column(nullable = false)
	// @JsonSerialize(using=DateSerializer.class)//指定自定义的json转换器
	public Date sendTime;

	/**
	 * 是否已推送
	 */
	@Column(name = "stat", nullable = false)
	public int state;
	
	@JoinColumn(name = "send_user_id")
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	public T_User sender;
	
	/**
	 * 发送人
	 */
	@Column(name = "send_user_id", unique = false, nullable = true, insertable = false, updatable = false)
	public Long senderId;

	/**
	 * lzh加
	 */
	@Column(name = "seq")
	public Long seq;

	/**
	 * 接收人查看次数，要不要把发送都浏览次数也加起来可以商榷一下
	 */
	public Short viewCount;
	


	/**
	 * 一个话题可能有多个附件
	 */
	// @OneToMany(fetch = FetchType.LAZY, mappedBy = "topic")
	// private T_Accessory accessory;
	/**
	 * 所属组 可以为空的哦 如果默认以公司分组的话，此字段就不需要了哦 亲!
	 */
	// private String group;

	public BaseMsg() {}

	

	
	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public T_User getSender() {
		return sender;
	}

	public void setSender(T_User sender) {
		this.sender = sender;
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

	

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
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
