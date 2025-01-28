package com.oops;

public class Bus implements BusOperations{

	private int busNum;
	private String driverName;
	private int totalSeats;
	private int availableSeats;
	
	public Bus(int busNum,String driverName,int totalSeats) {
		this.busNum=busNum;
		this.driverName=driverName;
		this.totalSeats=totalSeats;
		this.availableSeats=totalSeats;
	}
	
	public int getBusNum() {
		return busNum;
	}
	
	@Override
	public void displayBusDetails() {
		System.out.println("BUS NUMBER : "+busNum+" , DRIVER NAME : "+driverName+" , TOTAL SEATS : "+totalSeats+" , AVAILABLE SEATS : "+availableSeats);
	}
	
	@Override
	public void bookSeats(int seats) {
		if(seats <= availableSeats) {
			availableSeats -= seats;
			System.out.println(seats+" SEATS SUCCESSFULLY BOOKED ON BUS "+busNum);
		}
		else {
			System.out.println("SORRY, ONLY "+availableSeats+" SEATS ARE AVAILABLE ON BUS"+busNum);
		}
	}
	
	
	
}
