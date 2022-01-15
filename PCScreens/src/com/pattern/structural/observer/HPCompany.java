package com.pattern.structural.observer;

public class HPCompany implements Observer{

	@Override
	public void update(String screenType) {
		System.out.println("HP Company is requesting for "+screenType);
		
	}

}
