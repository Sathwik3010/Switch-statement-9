package com.codegnan.controlStatements;

import java.util.Scanner;

public class AtmOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double balance = 50000;
		int pin = 1234;
		int enteredPin;
		
		System.out.println("Enter your pin");
		enteredPin = sc.nextInt();
		if(enteredPin!=pin) {
			System.out.println("Invalid pin");
			return;
		}
		
		int choice;
		do {
			System.out.println("||===============================||");
			System.out.println("||============ATM Menu===========||");
			System.out.println("||============1.Deposite||");
			System.out.println("||============2. Withdraw======||");
			System.out.println("||============3.check balance===");
			System.out.println("||============4. exit==============||");
			System.out.println("||===============================||");
			System.out.println("Enter your choice");

			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the deposite amount: ");
				double depositAmount=sc.nextDouble();
				if(depositAmount%100!=0) {
					System.out.println("Please Deposit multiples of hundreds ex 700, 200, 1000, 500");
				} else {
					if(depositAmount<500) {
						System.out.println("Deposite minimum amount should be greater than 500");
					} else {
						balance += depositAmount;
						System.out.println("Deposited "+ depositAmount + "successfully");
						System.out.println("New Balance: "+balance);
					}
				}
				break;
				
			case 2:
				System.out.println("Enter the withdraw amount: ");
				double withdrawAmount = sc.nextDouble();
				if(withdrawAmount<500) {
					System.out.println("Minimum withdraw amount should be more than 500");
				} else {
					if(withdrawAmount%100 !=0) {
						System.out.println("please withdraw in multiples of 100");
					} else {
						if(withdrawAmount> balance) {
							System.out.println("Insufficient Funds! Current balance "+balance);
						} else {
							balance -= withdrawAmount;
							System.out.println("withdraw "+ withdrawAmount + " successfully");
							System.out.println("Remaining Balance: "+balance);
						}
					}
				}
				break;
			case 3:
				System.out.println("Your Current balance is : "+balance);
				break;
			case 4:
				System.out.println("Exiting.... Thankyou for using ATM.");
				break;
			default:
				System.out.println("Invalid choice. Please choose a valid option");
				break;
			}
		}while(choice!=4);
		
		sc.close();
	}

}
