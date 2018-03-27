package com.us.demo.performance;

import java.util.List;

import org.drools.runtime.StatefulKnowledgeSession;

public class EventSolver extends Thread{
	private List list;
	StatefulKnowledgeSession statefulKSession;
	
	EventSolver(){
		
	}
	
	EventSolver(List list){
		this.list=list;
	}
	
	EventSolver(List list,StatefulKnowledgeSession statefulKSession){
		this.list=list;
		this.statefulKSession=statefulKSession;
	}
	
	public void run(){
		while(true){
			for(int i=0;i<list.size();i++){
				statefulKSession.insert(list.get(i));
				statefulKSession.fireAllRules();
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
