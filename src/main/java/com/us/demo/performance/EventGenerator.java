package com.us.demo.performance;

import java.util.List;

import com.us.demo.performance.pojo.Event;

public class EventGenerator extends Thread{
	private List list;
	private int i=0;
	private int length=0;
	public EventGenerator(){
		
	}
	
	public EventGenerator(List list){
		// list变量初始化 list和外方共用同一个list的空间
		this.list=list;
	}
	
	public void run(){
		while(true){
			for(int i=0;i<1000;i++){
				Event event=new Event(String.valueOf(length),"test"+length,i);
				length++;
				list.add(event);
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
