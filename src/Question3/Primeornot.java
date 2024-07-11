package Question3;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		
		
		  Scanner sc= new Scanner(System.in);
		  int i=2;
		  boolean isPrime = true;
	       
	        
	            System.out.println("enter a number");
	            int num = sc.nextInt();
	
	        while(i<num){
	            
	        	if (num % i == 0)
	        		isPrime =false;
	        	i++;
	        }
	    if(isPrime)
	    
	    	System.out.println(num+ "is a prime");
	    
	    else
	    	System.out.println(num+" it is not prime");
	    
	}
}

