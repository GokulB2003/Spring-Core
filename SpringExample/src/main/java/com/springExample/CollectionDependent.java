package com.springExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDependent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("CollectionDependency.xml");
		CollectionDependency c=(CollectionDependency)context.getBean("p");
		c.show();
		
	}

}
