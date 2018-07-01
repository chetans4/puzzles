package org.chetan.main;

public class FinallyNotCall {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			System.exit(1);
		} catch (Exception e) {
			System.out.println("exception occur");
		}finally{
			System.out.println("finally called");
		}
	}
}
