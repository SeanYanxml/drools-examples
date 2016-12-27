package com.us.demo.money;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Test {
	public static void main(String []args){
		KieServices kieServices=KieServices.Factory.get();
		KieContainer kieContainer=kieServices.getKieClasspathContainer();
		KieSession kieSession=kieContainer.newKieSession("kession-money");
		
		Money money1=new Money(1);
		Money money2=new Money(20);
		Money money3=new Money(101);
		
		kieSession.insert(money1);
		kieSession.insert(money2);
		kieSession.insert(money3);
		//相当于一个栈结构 先进入的先执行
		kieSession.fireAllRules();
		//fire 射出 映射执行
		kieSession.dispose();

	}

}
