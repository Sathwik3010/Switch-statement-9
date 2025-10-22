package com.codegnan.controlStatements;

import java.util.Scanner;

public class Library_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code ex 1, 2, 3");
		int code = sc.nextInt();
		System.out.println("Enter the days 1 to 10 or more than 10");
		int days = sc.nextInt();
		
		int fine=0;
		
		switch(code) {
		
		case 1:
			if(days>=1 && days <=5) {
				fine = days*1;
				System.out.println(fine);
			} else {
				System.out.println("choose valid days for code 1  1- 5 days");
			}
			break;
			
		case 2:
			if(days>=6 && days <=10) {
				fine = (5*1) + (days-5)*2;
				System.out.println(fine);
			} else {
				System.out.println("choose valid days for code 2  6 - 10 days");
			}
			
			break;

		case 3:
			if(days>10 ) {
				fine = (5*1) + (5*2) + (days-10)*3;
				System.out.println(fine);
			} else {
				System.out.println("choose valid days for code 3 more than 10 days");
			}
		default:
			System.out.println("Enter a valid code");
		return;
		}
		sc.close();
	}

}
