package org.chetan.main;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String args[])
	{
	    int r, number=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
//		r = 6;
		
		for(int i=0;i<r;i++)
		{
//			for(int k=r; k>i; k--)
//			{
//				System.out.print(" ");
//			}
            number = 1;
			for(int j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
