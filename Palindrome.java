package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    palindrome(input);
}

	public static void palindrome(String input) {
		String str1=input;
		String str2="";
		for (int i = input.length() - 1; i >= 0; i--) {
			str2+=input.charAt(i);
		}
		if(str1.equals(str2))
			System.out.println("Palindrome word "+str1);
		else
			System.out.println("Not a palindrome word "+str1);;
	}

}
