package org.chetan.main;

import java.util.HashSet;


/**
  * Java program to find all permutations of a given String using recursion. 
  * For example, given a String "XYZ", this program will print all 6 possible permutations of
  * input e.g. XYZ, XZY, YXZ, YZX, ZXY, XYX
  *
  */

public class PermutationsOfString {
	
	static HashSet<String> allUniquePerm = new HashSet<String>();

	    public static void main(String args[]) {
	        permutation("123");
	        System.out.println(allUniquePerm);
	    }

	   
	 /*
	  * A method exposed to client to calculate permutation of String in Java. 
	  */
	   public static void permutation(String input){
	          permutation("", input);
	   }

	   /*
	    * Recursive method which actually prints all permutations
	    * of given String, but since we are passing an empty String
	    * as current permutation to start with,
	    * I have made this method private and didn't exposed it to client. 
	    */
	   private static void permutation(String perm, String word) {
	        if (word.isEmpty()) {
	        	allUniquePerm.add(perm + word);

	        } else {
	            for (int i = 0; i < word.length(); i++) {
	            	
	            	// substring begins at the specified beginIndex and extends to the character at index endIndex - 1
	            	//"hamburger".substring(4, 8) returns "urge"
	            	//"smiles".substring(1, 5) returns "mile"

	                permutation(perm + word.charAt(i), 
	                		word.substring(0, i)/*'',1,12*/ + word.substring(i + 1, word.length())/*123,23,3*/); 
	            }
	        }

	    }

}
//Output:
//123
//132
//213
//231
//312
//321
