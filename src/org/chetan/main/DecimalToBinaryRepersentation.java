package org.chetan.main;

import java.util.Scanner;

public class DecimalToBinaryRepersentation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to get binary rep : ");
		int number = scan.nextInt();
		
		printBuinaryFormat(number);
	}

	private static void printBuinaryFormat(int number) {
		
		int index = 0;
		int arr[] = new int[25];
		
		while(number > 0){
			arr[index] = number % 2;
			number = number / 2;
			index ++;
		}
		System.out.println("Binary repersentation : ");
		for (int i = index -1 ; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
