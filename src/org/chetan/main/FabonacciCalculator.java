package org.chetan.main;

import java.util.Scanner;

public class FabonacciCalculator {

	public static void main(String[] args) {
		System.out.println("enter number to print fabonacci series :");
		int number = new Scanner(System.in).nextInt();
		
		for (int i = 1; i <= number; i++) {
//			System.out.print(printFabonacci(i)+", ");
			System.out.print(printFabonacciRecursion(i)+", ");
		}
	}

	private static int printFabonacciRecursion(int number) {
		if(number == 1 || number == 2){
			return 1;
		}
		
		return printFabonacciRecursion(number - 1) + printFabonacciRecursion(number - 2); 
	}

	private static int printFabonacci(int number) {
		if(number == 1 || number == 2){ 
			return 1;
		}

		int fab1 = 1, fab2 = 1, fabonacci = 1;
		for (int i = 3; i <= number; i++) {
			fabonacci = fab1 + fab2;
			fab1 = fab2;
			fab2 = fabonacci;
		}
		return fabonacci;

	}
	
	
}
