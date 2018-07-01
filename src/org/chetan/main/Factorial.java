package org.chetan.main;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Insert number to find factorial : ");
		int number = scan.nextInt();
		
		System.out.println("By Iteration : "+factoriaclByIteration(number));
		
		System.out.println("By recurision : "+factoriacalByRecusision(number));
				
	}

	private static int factoriacalByRecusision(int number) {
		int factoriacl = 1;
		while(number > 0){
			factoriacl = factoriacl * number;
			number--;
		}
		return factoriacl;
	}

	private static int factoriaclByIteration(int number) {
		if(number == 0){
			return 1;
		}
		return number * factoriacalByRecusision(number - 1); // tail-recurision
	}
}
