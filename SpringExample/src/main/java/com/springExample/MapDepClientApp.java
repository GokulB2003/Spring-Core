package com.springExample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapDepClientApp {
	public static void main(String args[])
	{
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("MapDependencies.xml");
	MapDependency pp=(MapDependency)context.getBean("m");//
	pp.show();
	}

}
