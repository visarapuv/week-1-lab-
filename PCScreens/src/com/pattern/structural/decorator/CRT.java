package com.pattern.structural.decorator;

public class CRT extends ScreenType{
	
	private PCScreen screen;
    
    public CRT(PCScreen screen) {
        this.screen = screen;
    }
    
    @Override
    public String description() {
        return screen.description() + " having Cathode Ray Tubes, ";
    }
}
