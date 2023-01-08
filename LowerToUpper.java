package strings;

import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    lowerToUpper(input);

	}

	public static void lowerToUpper(String input) {
		String modifiedtext = "";
				for (int i = 0; i < input.length(); i++) {
					char c = input.charAt(i);
					if (Character.isLowerCase(c)) {
					modifiedtext += Character.toUpperCase(c);
					} else {
					modifiedtext += Character.toLowerCase(c);
					}
	}
				System.out.println(modifiedtext);
}
}