package com.codegnan.controlStatements;

import java.util.Scanner;

public class CanteenSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final int TEA_PRICE = 10;
		final int COFFEE_PRICE = 15;
		final int SAMOSA_PRICE = 20;
		final double TAX_RATE = 0.05;

		int teaQty = 0, coffeeQty = 0, samosaQty = 0;

		while (true) {

			System.out.println("\n||=========== CANTEEN MENU ===========||");
			System.out.println("1. View Menu");
			System.out.println("2. Order Items");
			System.out.println("3. View Bill");
			System.out.println("4. Checkout and Exit");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n ------------ MENU ------------");
				System.out.println("1. Tea    -₹ " + TEA_PRICE);
				System.out.println("1. Coffee -₹ " + COFFEE_PRICE);
				System.out.println("1. Samosa -₹ " + SAMOSA_PRICE);
				break;

			case 2:
				System.out.println("Enter item numbers to order(1-3)");
				int item = sc.nextInt();

				System.out.println("Enter the Quantity");
				int qty = sc.nextInt();

				if (qty <= 0) {
					System.out.println("Enter the valid number");
				}

				switch (item) {
				case 1:
					teaQty += qty;
					System.out.println(qty + " Tea(s) added.");
					break;
				case 2:
					coffeeQty += qty;
					System.out.println(qty + " Coffee(s) added.");
					break;
				case 3:
					samosaQty += qty;
					System.out.println(qty + " Samosa(s) added.");
					break;
				default:
					System.out.println("Invalid item number.");
					break;
				}
				break;

			case 3:
				System.out.println("\n--- BILL ---");
				double subTotal = 0;

				if (teaQty > 0) {
					int teaTotal = teaQty * TEA_PRICE;
					System.out.println("Tea " + teaQty + " = ₹" + teaTotal);
					subTotal += teaTotal;
				}

				if (coffeeQty > 0) {
					int coffeeTotal = coffeeQty * COFFEE_PRICE;
					System.out.println("Coffee " + coffeeQty + " = ₹" + coffeeTotal);
					subTotal += coffeeTotal;
				}

				if (samosaQty > 0) {
					int samosaTotal = samosaQty * SAMOSA_PRICE;
					System.out.println("Samosa " + samosaQty + " = ₹" + samosaTotal);
					subTotal += samosaTotal;
				}

				if (subTotal == 0) {
					System.out.println("No items ordered yet.");
					break;
				}
				
				double tax = subTotal * TAX_RATE;
				double total = subTotal + tax;
                System.out.println("Subtotal = ₹" + total);
                break;

			case 4:
				System.out.println("Thank You ! Exiting System");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}
}
