package com.pattern.structural.decorator;

public class LED extends ScreenType{
	
	private PCScreen screen;
    
    public LED(PCScreen screen) {
        this.screen = screen;
    }
    
    @Override
    public String description() {
        return screen.description() + " and Light Emitting Diodes ";
    }
}
