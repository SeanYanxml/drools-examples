package com.us.demo.performance.pojo;

public class Event {
	private String id;
	private String name;
	private int number;
	private String time;//可能需要时间戳进行比较
	// 0表示未读 1表示已读
	private int isRead;
	// 0表示未响应 1表示已响应/但是未处理完成 2表示已销毁
	private int status;
	
	public Event(){
		super();
	}
	
	public Event(String id,String name,int number){
		this.id=id;
		this.name=name;
		this.number=number;
		
		isRead=0;
		status=0;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getIsRead() {
		return isRead;
	}
	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

}
