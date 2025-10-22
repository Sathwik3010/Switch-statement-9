package com.codegnan.controlStatements;

import java.util.Scanner;

public class hotelRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Room Type (1:Standard or 2:Delux) ");
		int room = sc.nextInt();
		System.out.println("Enter the Season Type (1:Peek or 2:Off-peak) ");
		int season = sc.nextInt();
		
		int price=0;
		boolean valid = true;
		
		switch(room) {
		case 1:
			if(season == 1) {
				price = 100;
			} else {
				if(season == 2) {
					price = 80;
				} else {
					valid = false;
				}
			}
			break;
			
		case 2:
			if(season == 1) {
				price = 200;
			} else {
				if(season == 2) {
					price = 150;
				} else {
					valid = false;
				}
			}
			break;

		case 5:
			System.out.println("I am Exiting");
			
		default:
			valid = false;
			break;
		}
		
		if(valid) {
            System.out.println("$" + price);	
		} else {
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
