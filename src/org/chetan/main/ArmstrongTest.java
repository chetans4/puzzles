package org.chetan.main;

import java.util.Scanner;

public class ArmstrongTest {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to know armstrong: ");
		int number = scanner.nextInt();
		System.out.println(number+", is armstrong : "+isArmstrong(number));
		
	}

	private static boolean isArmstrong(int number) {
		
		int result = 0;
		int origin = number;
		while(number > 0){
			int reminder = number % 10;
			result = result + (reminder * reminder * reminder);
			number = number / 10;
			
		}
		if(origin == result){
			return true;
		}
		return false;
	}

}
