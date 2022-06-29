package com.nt.fmp;

public class NagpurFactory {
	
	public static void paint() {
		System.out.println("Painting Bikes....");
	}
	
	public static void assemble() {
		System.out.println("Assembling Bikes....");
	}
	
	public static void test() {
		System.out.println("Testing Bikes....");
	}
	
	public static Bike createBike(String type) {
		Bike bike=null;
		
		if(type.equalsIgnoreCase("pulsor")) {
			bike=new Pulsor();
			System.out.println("Creating Pulsor Bike...");
		}
		
		else if(type.equalsIgnoreCase("discover")) {
		bike=new Discover();
		System.out.println("Creating Discover Bike...");
		}
		else {
			throw new IllegalArgumentException("Invaild bike model..");
		}
		paint();
		assemble();
		
		return bike;
	}

}
