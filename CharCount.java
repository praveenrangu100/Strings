package strings;

import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		checkCharacter(str);
	}
	public static void checkCharacter(String str) {
		if(str.isEmpty()) {
			System.out.println("Empty string");
			}else {
			int vowelCount = 0,consonantCount = 0,digitCount = 0,splCharCount = 0;
			for(int i = 0; i< str.length();i++) {
				if(Character.isLetter(str.charAt(i))) {
					if(str.charAt(i) == 'a' || str.charAt(i) == 'e'||str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
						vowelCount++;
						}else {
							consonantCount++;
						}
					}else if(Character.isDigit(str.charAt(i))) {
						digitCount++;
					}else {
						splCharCount++;
					}
				
				
				}
				
				System.out.println("No of vowels " + vowelCount + "\nNo of consonants " + consonantCount + "\nNo of  Digits " + digitCount + "\nNO of Spl Characters " +splCharCount);
				System.out.println("given String " +str);
			}
			}

		

	}


