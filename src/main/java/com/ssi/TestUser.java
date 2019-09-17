package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	
	
	public static void main(String[] args) {

		System.out.println("Application Started : ");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext context1=(AbstractApplicationContext)context;
		context1.registerShutdownHook();
		Address address1=context.getBean("adr1",Address.class);
		System.out.println(address1);
		
		Account account1=context.getBean("act1",Account.class);
		System.out.println(account1);

		Account account2=context.getBean("act1",Account.class);
		System.out.println(account2);
		
		
		
		
		

	}

}
