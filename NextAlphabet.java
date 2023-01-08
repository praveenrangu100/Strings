package strings;

import java.util.Scanner;

public class NextAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    nextAlphabet(input);
	}

	public static void nextAlphabet(String input) {
		String modifiedText = "";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			modifiedText += (char) ( c + 1);
		}
		System.out.println(modifiedText);
		}
		
	}


