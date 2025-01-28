package com.oops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BusManagementSystem b = new BusManagementSystem();
		
		b.addBuses(new Bus(101,"SAM",2));
		b.addBuses(new LuxuryBus(102,"RAM",5,"AC & FOODS"));
		b.addBuses(new Bus(103, "zam", 10));
		
		Scanner s = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("\nBUS TICKET BOOKING SYSTEM");
			System.out.println("1)DISPLAY ALL BUS");
			System.out.println("2)BOOK TICKETS");
			System.out.println("3)EXIT");
			
			System.out.print("ENTER YOUR CHOICE : ");
			choice = s.nextInt();
			
			switch (choice) {
			case 1: {
				b.displayBusDetails();
				break;
				
			}
            case 2: {
				System.out.print("ENTER BUS NUMBER : ");
				int busNum = s.nextInt();
				
				System.out.print("ENTER NUMBER OF SEATS TO BOOK : ");
				int seats = s.nextInt();
				
				b.bookSeats(seats, busNum);
				break;
				
			}
            case 3: {
	
            	System.out.println("\nTHANK YOU FOR USING THE BUS TICKET BOOKING SYSTEM");
            	break;
	
            }
			default:
				System.out.println("INVALID CHOICE");
			}
			
		} while (choice != 3);
		

    }
}