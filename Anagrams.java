package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String str1 = sc.nextLine();
	    String str2 = sc.nextLine();
	    System.out.println(validateStrings(str1,str2));
	    System.out.println(isAnagrams(str1,str2));
	}
	public static boolean isAnagrams(String str1, String str2) {
	    int validationResult = validateStrings(str1, str2);
	    if (validationResult == -1 || validationResult == -2) {
	        return false;
	    }
	    if (str1.length() != str2.length()) {
	        return false;
	    }
	    char[] charArray1 = str1.toCharArray();
	    char[] charArray2 = str2.toCharArray();
	    Arrays.sort(charArray1);
	    Arrays.sort(charArray2);
	    return Arrays.equals(charArray1, charArray2);
	}
	public static int validateStrings(String str1, String str2) {
	    if (str1.length() == 0 || str2.length() == 0) {
	        return -1;
	    }
	    if (str1.contains(" ") || str2.contains(" ")) {
	        return -2;
	    }
	    return 1;
	}
}
