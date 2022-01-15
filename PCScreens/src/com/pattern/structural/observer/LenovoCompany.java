package com.pattern.structural.observer;

public class LenovoCompany implements Observer{

	@Override
	public void update(String screenType) {
		System.out.println("Lenovo Company is requesting for "+screenType);
		
	}

}
