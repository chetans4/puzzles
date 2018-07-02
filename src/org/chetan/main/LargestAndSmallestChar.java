package org.chetan.main;

public class LargestAndSmallestChar {

	public static void main(String[] args) {
		String str = "GeEksforGeeks";
		
		System.out.println("smallest--char : "+smallestChar(str));
		
		System.out.println("largest--char : "+largestChar(str));
	}

	private static char largestChar(String str) {
		char largest = 'A';
		for (int i = 0; i < str.length(); i++) {
			if(largest < str.charAt(i)){
				largest = str.charAt(i);
			}
		}
		System.out.println("largest ascii value : "+((int)largest));
		return largest;
	}

	private static char smallestChar(String str) {
		char smallest = 'z';
		for(int i=0; i < str.length(); i++){
			if(smallest > str.charAt(i)){
				smallest = str.charAt(i);
			}
		}
		System.out.println("smallest ascii value : "+((int) smallest));
		return smallest;
	}

}
