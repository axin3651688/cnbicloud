package com.cnbicloud.vo;
import java.util.Date;
import javax.persistence.Column;
//@org.hibernate.annotations.Table(appliesTo = "demo_table",comment="测试表")
//@Entity
//@Table(name = "demo_table")
public class DemoTable {
	
	/**
	* 床位单价（price-Double）
	*/
	@Column(name="price",columnDefinition = "Decimal(10,2) COMMENT '床位单价'", scale = 2 ,precision=10)
	private double price;

	/**
	* 床位购买时间（buy_time-Date[精确到分钟]）
	*/
	@Column(name="buy_time",columnDefinition="DATETIME COMMENT '床位购买时间'")
	private Date buyTime;

	/**
	* 床位所属楼室（room-String）
	*/
	@Column(name="room",columnDefinition="varchar(50) COMMENT '楼室'")
	private String room;

	/**
	* 终端电量（power-Integer[10级]）
	*/
	@Column(name="power",columnDefinition="int(3) COMMENT '床位终端电量'" )
	private int power;
	
	public DemoTable() {}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	

}
