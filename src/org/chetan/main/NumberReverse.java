package org.chetan.main;

public class NumberReverse {

	public static void main(String[] args) {
		int num = 7813649;
		System.out.println("Reverse of "+num+", is : "+reverseNUmber(num));
	}

	private static int reverseNUmber(int num) {
		int reverse = 0;
		while(num > 0){
			int reminder = num % 10;
			reverse = (reverse * 10) + reminder ;
			num = num/10;
		}
		return reverse;
	}

}
