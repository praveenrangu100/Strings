package strings;

import java.util.Scanner;

public class StringsExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		System.out.println( checkCharacter(str));

	}

	public static String checkCharacter(String str) {
	
		int vowelCount = 0,consonantCount = 0;
		for(int i = 0; i< str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'||str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vowelCount++;
			}else {
				consonantCount++;
			}
		
	}
		return "No of vowels " + vowelCount + "\n No of consonants " + consonantCount;
	 
	} 

	}


