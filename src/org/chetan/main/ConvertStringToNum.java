package org.chetan.main;

public class ConvertStringToNum {
	public static void main(String[] args) {
		String str = "10245";
		
		int num = 0;
		for(int i = 0; i<str.length(); i++){
			int charnum = str.charAt(i) - '0';
			System.out.println("char "+i+", "+charnum);
			num = (num * 10) + charnum; 
		}
		
		System.out.println("number : "+num);
	}
}
