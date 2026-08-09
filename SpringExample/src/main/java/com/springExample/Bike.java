package com.springExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Bike")
@Scope("prototype")
class bike {
	@Value("Honda")
	private String brand;
	@Value("Black")
	private String colour;

	public bike() {
		System.out.println("Constructor called");
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
@Component("Car")
class Car {
	@Value("Honda")
	private String brand;
	@Value("white")
	private String colour;
	
	

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	
	
	
	

}