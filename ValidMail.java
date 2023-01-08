package strings;

import java.util.Scanner;

public class ValidMail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter emailID: ");
	    String emailId = sc.nextLine();
	    System.out.println(isValidMailID(emailId));
	}
	public static String isValidMailID(String email) {
		if (!Character.isLowerCase(email.charAt(0))) {
			return "-1";
		}
			if (!email.contains("@")) {
			return "-2";
		}
			if (email.indexOf("@") != email.lastIndexOf("@")) {
			return "-3";
		}
			if (!email.endsWith(".com") && !email.endsWith(".co.in")) {
			return "-4";
		}
			for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if (!Character.isLowerCase(c) && !Character.isDigit(c) && c != '_' && c != '.') {
				return "-5";
		}
		}
		return "Valid";
		}
}
