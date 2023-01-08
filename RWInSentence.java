package strings;

import java.util.Scanner;

public class RWInSentence {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a string: ");
		    String input = sc.nextLine();
		    String strArray[] = input.split(" ");
		    reverseWords(strArray,input);
	}
	public static void reverseWords(String[] strArray, String input) {
		String reversed = "";
		for (int i=0;i<strArray.length;i++ ) {
			for(int j=i;j<strArray.length;j++) {
				reversed+= input.charAt(i);
			}
		}
		System.out.println(reversed);		 
		}
}