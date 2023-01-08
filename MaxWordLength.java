package strings;

import java.util.Scanner;

public class MaxWordLength {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a string: ");
	    String input = sc.nextLine();
	    String word = "";        
	    int length = 0;    
	    input = input + " ";    
	    findMaxWordLength(input,word,length);            
	    
	}
	public static void findMaxWordLength(String input,String word,int length) {
		String large="";
	    String[] words = new String[100];
		for(int i = 0; i < input.length(); i++){      
	          if(input.charAt(i) != ' '){    
	              word = word + input.charAt(i);    
	          }    
	          else{    
	              words[length] = word;    
	              length++;      
	              word = "";    
	          }    
	      }                
	     large = words[0];        
	      for(int i = 0; i < length; i++){    
	          if(large.length() < words[i].length())    
	              large = words[i];    
	      }       
	      System.out.println("Largest word: " + large+" "+large.length());    
	}
}
