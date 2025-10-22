package com.codegnan.controlStatements;

import java.util.Scanner;

public class WeatherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the code ");
			System.out.println("1 - Sunny");
			System.out.println("2 - Rainy");
			System.out.println("3 - Stormy");
			System.out.println("4 - Exit");
			int code = sc.nextInt();
			if (code == 4) {
				System.out.println("Exiting...");
				break;
			}
			System.out.println("Enter the tem between -20 to 50");
			int temp = sc.nextInt();
			

			boolean valid = true;

			switch (code) {
			case 1:
				System.out.println("Sunny");
				break;

			case 2:
				System.out.println("Rainy");
				break;

			case 3:
				if (temp < 10) {
					System.out.println("Severe Warning");
				} else {
					System.out.println("Stormy");
				}
				break;
			}
		} while (true);
		sc.close();

	}

}
