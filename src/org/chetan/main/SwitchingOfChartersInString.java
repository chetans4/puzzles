package org.chetan.main;

public class SwitchingOfChartersInString {

	public static void main(String[] args) {
		
//		switchWithNext();
//		switchWithAlternate();
	
		changeCharAndLengthOnRuntimeForLoop();
	}

	private static void changeCharAndLengthOnRuntimeForLoop() {
		
		StringBuilder altStr = new StringBuilder("1234");
		altStr.append("567");
		System.out.println("length : "+altStr.length());
		int i=0; 
		for(;i<altStr.length(); i++){
			System.out.println("index : "+i);
//			altStr.deleteCharAt(0); // It works 
//			altStr.append("89"); // It throws heap space error because, every time the loop execute the length will increase with 2
		}
		System.out.println("length : "+i);
	}

	private static void switchWithAlternate() {
		String str = "chetan";
		char[] altStr = str.toCharArray();
		
		for(int i=0; i<altStr.length; i++){
			/*if(i+4==altStr.length()){
				break;
			}*/
			
			if(i+2 < altStr.length){
				char temp = altStr[i];
				altStr[i] = altStr[i+2];
				altStr[i+2] = temp;
			}
			
		}
		
		System.out.println("alter--str : "+new String(altStr));
	}

	private static void switchWithNext() {
		String str = "chetans";
		StringBuilder altStr = new StringBuilder();
		
		for(int i=0; i<str.length(); i++){
			
			if(i % 2 == 0){
				if(i+1 < str.length()){
					altStr.append(str.charAt(i+1));
				}
				
				altStr.append(str.charAt(i));
			}
			
		}
		
		System.out.println("altered String : "+altStr);
	}
}
