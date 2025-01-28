package com.oops;

import java.util.ArrayList;

public class BusManagementSystem {

	private ArrayList<Bus> buses = new ArrayList<Bus>();
	
	public void addBuses(Bus bus) {
		buses.add(bus);
	}
	
	public void displayBusDetails() {
		for(Bus bus : buses) {
			bus.displayBusDetails();
		}
	}
	
	public void bookSeats(int seats, int busNum) {
		for(Bus bus : buses) {
			if(bus instanceof Bus && bus.getBusNum()==busNum) {
				bus.bookSeats(seats);
				return;
			}
		}
		
		System.out.println("BUS "+busNum+" IS NOT FOUND");
	}
	
	
}	