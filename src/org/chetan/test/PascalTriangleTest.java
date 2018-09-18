package org.chetan.test;

/*
 *   1
 *  11
 * 121 
 *1331   
 * */

public class PascalTriangleTest {

	public static void main(String[] args) {
		
		int n = 5;
		int start = 1;
		
		for (int i = 1; i <= n; i++) {
			
			for(int j=n; j>i ; j--){
				System.out.print(" ");
			}
			
			for(int k=0; k < i; k++){
				if(k == 1 || k == 2){
					System.out.print("1");
				}
				System.out.print((k-1) + (k-2));
				
				//System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
