package com.pattern.structural.observer;

import java.util.ArrayList;
import java.util.List;

public class PCWorld implements Subject{

	private List<Observer> listOfObservers;
    private String screenType;    
    
    public PCWorld() {
        listOfObservers = new ArrayList<Observer>();
    }
    
    public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	
	
    
	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	@Override
	public void addObserver(Observer observer) {
		listOfObservers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer); 
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : listOfObservers) {
            observer.update(screenType);
        }
		
	}
	public void CheckScreenTypeAvailable(String newScreenType) { 
        screenType = newScreenType;
        notifyObservers();
    }
	
}
