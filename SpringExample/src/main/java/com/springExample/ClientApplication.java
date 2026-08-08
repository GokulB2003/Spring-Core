package com.springExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("SpringExample.xml");
		
		Object obj=context.getBean("data");
		//Employee emp=new Employee();
		Employee emp=(Employee)obj;
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());

	}

}
