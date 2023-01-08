package strings;

import java.util.Scanner;

public class MiddletoFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    middleTofirt(input);

	}

	public static void middleTofirt(String input) {
		String modifiedText = " ";
		String op="";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
				if (c == '-') 
					modifiedText += input.charAt(i);
				else
					op += input.charAt(i);
				}
		System.out.println(modifiedText + op);
		}
		
	}

