package Stringprgrms;


import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) {

		
		 String s, reverse = ""; 
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string is a palindrome");  
	      s = in.nextLine();   
	      for ( int i = s.length() - 1; i >= 0; i-- )  
	      {
	         reverse = reverse + s.charAt(i);  
	      }
	      if (s.equals(reverse))  {
	         System.out.println("Entered string is a palindrome."); 
	      }
	      else { 
	         System.out.println("Entered string isn't a palindrome.");   
	      }
	      
	}

}
