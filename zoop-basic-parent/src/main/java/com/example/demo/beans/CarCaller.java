package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarCaller {

	@Autowired
	Car car;
	@Override
	public String toString() {
		System.out.println(car.toString());
		return "Car{"+car+"}";
	}
	
}
