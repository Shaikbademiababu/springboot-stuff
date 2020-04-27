package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Car {
	
	

	@Value("${carNumber}")
	private int carNumber;
	@Value("${carName}")
	private String carName;
	@Value("${carModel}")
	private String carModel;

	public void breakPad() {
		
		System.out.println("in method");
	}
	
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", carModel=" + carModel + "]";
	}
}
