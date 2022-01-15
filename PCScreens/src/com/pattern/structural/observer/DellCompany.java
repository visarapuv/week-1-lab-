package com.pattern.structural.observer;

public class DellCompany implements Observer{

	@Override
	public void update(String screenType) {
		System.out.println("Dell Company is requesting for "+screenType);
		
	}

}
