package com.nt.problem;

import com.nt.fmp.Bike;
import com.nt.fmp.ChennaiFactory;

public class SouthConsumer {

	public static void main(String[] args) {
		
		Bike bike=null;
		bike=ChennaiFactory.createBike("pulsor");
		bike.drive();
	}

}
