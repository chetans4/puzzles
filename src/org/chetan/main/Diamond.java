package org.chetan.main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		try {
			createDiamond();
			
//			System.out.println("Enter a number");
//	        Scanner sc=new Scanner(System.in);
//	        int no=sc.nextInt();
//
//	        int count=1;
//	        for(int i=1;i<=2*no-1;i++)
//	        {
//	            for(int j=count;j<=no;j++)
//	            {
//	                System.out.print("  "); 
//	            }
//	            for(int k=1;k<=count*2-1;k++)
//	            {
//	                System.out.print("* ");
//	            }
//		        
//	            if(i<no)
//		            count++;
//		        else
//		            count--;
//	                System.out.println(""); 
//	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	readUsingConsole();
//	readUsingBufferedReader();
//	readUsingScanner();
	
	private static void createDiamond() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Diamond size:");
		int size = scan.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = size - i; j > 0 ; j--) {
				System.out.print(" ");
			}
			for(int j=0; j< i ; j++){
				System.out.print("*");
			}
			
			for(int j = 1; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = size - 1; i >= 1; i--) {
			for (int j = size - i; j > 0 ; j--) {
				System.out.print(" ");
			}
			for(int j=0; j< i ; j++){
				System.out.print("*");
			}
			
			for(int j = 1; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void readUsingScanner() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lenght:");
		int length = scan.nextInt();
		for (int i = 0; i < length; i++) {
			System.out.println("Enter one more >");
			String data = scan.next();
			System.out.println("data entered next: "+data);
		}
	}

	private static void readUsingConsole() {
		Console con = System.console(); //null in IDE
		System.out.println(con+"\nReading using console, enter length:");
		String length = con.readLine();
		for (int i = 0; i < Integer.parseInt(length); i++) {
			con.printf("", "Enter One More");
			String data = con.readLine();
			System.out.println("entered data : "+data);
		}
	}

	private static void readUsingBufferedReader() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Reading data using BufferedReader, enter length:");
		String length = reader.readLine();
		for(int i=0; i<Integer.parseInt(length); i++){
			System.out.println("enter one more");
			String data = reader.readLine();
			System.out.println("entered data : "+data);
		}
	}
}
