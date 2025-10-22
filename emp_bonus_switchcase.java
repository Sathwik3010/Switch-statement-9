package com.codegnan.controlStatements;

import java.util.Scanner;

public class emp_bonus_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the role code");
		int code = sc.nextInt();
		System.out.println("Enter the Salary");
		int salary = sc.nextInt();
		
		switch(code) {
			case 1:
				salary *=1.10;
				System.out.println(salary);
				break;
			case 2:
				salary *=1.05;
				System.out.println(salary);
				break;
			case 3:
				salary +=500;
				System.out.println(salary);
				break;
			default:
				System.out.println("Enter a valid role code");
		
			sc.close();
		}
	}

}
