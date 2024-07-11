package Javaexm;

public class NumberPattern {

	public static void main(String[] args) {
	
		
		 int rows = 6; 

	    
	        for (int i = 0; i < rows; i++) {
	       
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(j + " ");
	            }
	            System.out.println(); 
	        }
	}

}
