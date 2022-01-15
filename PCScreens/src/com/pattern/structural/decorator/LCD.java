package com.pattern.structural.decorator;

public class LCD extends ScreenType{
	
	private PCScreen screen;
    
    public LCD(PCScreen screen) {
        this.screen = screen;
    }
    
    @Override
    public String description() {
        return screen.description() + " Liquid Crystal Display, ";
    }
}
