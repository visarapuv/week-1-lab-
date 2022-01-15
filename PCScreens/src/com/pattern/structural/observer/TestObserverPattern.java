package com.pattern.structural.observer;

public class TestObserverPattern {

	public static void main(String[] args) throws InterruptedException {

		PCWorld pc = new PCWorld();

        Observer dell = new DellCompany();
        Observer lenovo = new LenovoCompany();
        Observer hp = new HPCompany();

        pc.addObserver(dell);
        pc.addObserver(lenovo);
        pc.addObserver(hp);
        
        pc.CheckScreenTypeAvailable("LED");
        
        System.out.println("\nAfter sometime requirement changes to LCD...\n");
        
        Thread.sleep(10000);
        
        pc.CheckScreenTypeAvailable("LCD");

	}

}
