package org.chetan.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern1 {

	public static void main(String[] args) {

		BufferedReader br = null;
        try {
        	br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.print("Enter something : ");
            String input = br.readLine();
            System.out.println("User entered : "+input);
            
            for(int i=1; i <= Integer.parseInt(input); i++){
    			for (int j = 0; j < i; j++) {
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    		for(int i=Integer.parseInt(input); i >=1; i--){
    			for (int j = i; j > 0; j--) {
    				System.out.print("$");
    			}
    			System.out.println();
    		}
        }catch(Exception e){
        	e.printStackTrace();
        }finally {
        	System.out.println("finally called");
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
