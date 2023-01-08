package strings;

import java.util.Scanner;


public class ReverseWords {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a string: ");
		    String input = sc.nextLine();
		    reverseWords(input);
	}
	public static void reverseWords(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));
			}
			String reversedWord = sb.toString();
		    System.out.println(reversedWord);
	
}
}

			/*StringBuilder sb = new StringBuilder(input);
		    sb.reverse();
		    String reversed = sb.toString();
		    System.out.println("Reversed string: " + reversed);*/