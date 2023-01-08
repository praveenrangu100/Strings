package strings;

import java.util.Scanner;

public class MaskedMail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter emailID: ");
	    String emailId = sc.nextLine();
	    System.out.println(maskMailID(emailId));
	}
	public static String maskMailID(String email) {
		if (!email.contains("@") || !email.contains(".")) {
			return "Invalid email format.";
			}
		int atIndex = email.indexOf("@");
		int replace = email.indexOf(2);
		int dotIndex = email.lastIndexOf(".");
		//String mask = email.substring(0,atIndex);
		String maskedEmail = email.substring(0, 2)+(getmasked(email)+email.substring(atIndex));
		return maskedEmail;
		}
	public static String getmasked(String email) {
		String mask="";
		for(int i=0;i<email.length();i++) {
			if(i>1&&i<(email.length()-10)) {
				mask+="X";
			}
		}
		return mask;
	}
}
