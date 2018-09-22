package org.chetan.main;

public class SwitchingOfChartersInString {

	//chetan > ehcnat
	public static void main(String[] args) {
		
//		switchWithNext();
//		switchWithAlternateAllIndex();
		switchWithAlternateOneCharAtATime();
//		changeCharAndLengthOnRuntimeForLoop();
	}

	private static void switchWithAlternateOneCharAtATime() {
		String str = "chetan";
		char[] charArr =  str.toCharArray();
		for(int i=0; i<charArr.length; i++){
			if((i+1) % 3 == 0){
				char temp = charArr[i];
				charArr[i] = charArr[i-2];
				charArr[i-2] = temp;
			}
		}
		System.out.println("alternate--switch : "+new String(charArr));
	}

	private static void switchWithAlternateAllIndex() {
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
		
		String str = "chetan";
		for (int i = 0; i < str.length(); i++) {
			if(i%2 == 0 && i+1 < str.length()){
				System.out.println("str-- "+i+" : "+str);
				str = str.substring(0,i) + str.charAt(i+1) +str.charAt(i)  + str.substring(i+2);
			}
		}
		
		System.out.println("str : "+str);
//		switchWithNextSB();
	}
	
	private static void switchWithNextSB() {
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

}
