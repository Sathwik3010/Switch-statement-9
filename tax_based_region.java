package com.codegnan.controlStatements;

import java.util.Scanner;

public class tax_based_region {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("\nEnter the region code:");
        System.out.println("1 - North");
        System.out.println("2 - South");
        System.out.println("3 - East");
        System.out.println("4 - West");
        System.out.println("5 - Exit");
        int code = sc.nextInt();
        	
        if(code==5) {
        	System.out.println("Exiting...");
            break;
        }
		System.out.println("Enter the income");
		double income = sc.nextInt();

		double taxAmount = 0;
		boolean valid = true;

		
			switch (code) {
			case 1:
				taxAmount = (int)income * 0.05;
				break;
			case 2:
				taxAmount = (int)income * 0.06;
				break;
			case 3:
				taxAmount = (int)income * 0.07;
				break;
			case 4:
				taxAmount = (int)income * 0.08;
				break;
			default:
				System.out.println("Invalid input");
				break;
			}
            System.out.println("Tax amount for this region: $" + (taxAmount));
		} while (true);


		sc.close();
	}

}
