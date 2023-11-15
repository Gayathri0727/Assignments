package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {	
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		Address add=(Address) context.getBean("add",Address.class);
		System.out.println(add);
		Customer emp=(Customer) context.getBean("empbean",Customer.class);
		System.out.println(emp);
		Customer emp1=(Customer) context.getBean("updateEmp",Customer.class);
		System.out.println(emp1);	
	}
	
}
