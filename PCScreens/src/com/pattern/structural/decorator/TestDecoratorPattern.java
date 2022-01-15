package com.pattern.structural.decorator;

public class TestDecoratorPattern {
	public static void main(String[] args) {
		PCScreen screen = new PCScreen();
	        
		screen = new CRT(screen);
		screen = new LCD(screen);
		screen = new LED(screen);
	        
	    System.out.println("You're getting " + screen.description());
	}
}
