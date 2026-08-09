package com.springExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.*;

import com.configurationBike.BikeConfig;

public class BikeClientApp {
	public static void main(String args[]) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BikeConfig.class);
		bike b=(bike)context.getBean("Bike");
//		String brand=b.getBrand();
//		String Colour=b.getColour();
//		System.out.println(brand+":"+Colour);
		
		bike bk=(bike)context.getBean("Bike");
//		Car br=(Car)context.getBean("Car");
//		String bra=br.getBrand();
//		String Cr=br.getColour();
//		System.out.println(bra+":"+Cr);
	}

}
