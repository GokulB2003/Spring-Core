package com.springExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourierOffice {
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ConstructorInjection.xml");
		Courier r=(Courier) context.getBean("c");
		r.show();
		
	}

}
