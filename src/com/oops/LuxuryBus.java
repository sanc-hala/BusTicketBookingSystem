package com.oops;

public class LuxuryBus extends Bus{
	
	private String amenities;
	
	public LuxuryBus(int busNum,String driverName,int totalSeats, String amenities) {
		super(busNum,driverName,totalSeats);
		this.amenities=amenities;
	}
	
	public void displayBusDetails() {
		super.displayBusDetails();
		System.out.println("AMENITIES : "+amenities);
	}
	
	
}
