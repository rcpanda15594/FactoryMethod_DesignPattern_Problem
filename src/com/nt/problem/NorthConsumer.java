package com.nt.problem;

import com.nt.fmp.Bike;
import com.nt.fmp.NagpurFactory;

public class NorthConsumer {

	public static void main(String[] args) {
		
		Bike bike=null;
		bike=NagpurFactory.createBike("pulsor");
		bike.drive();
	}

}
