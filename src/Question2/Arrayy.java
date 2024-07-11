package Question2;


import java.util.Scanner;
public class Arrayy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();

	    
	        int positiveCount = 0;
	        int negativeCount = 0;
	        int zeroCount = 0;

	       
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            int num = sc.nextInt();
	            if (num > 0) {
	                positiveCount++;
	            } else if (num < 0) {
	                negativeCount++;
	            } else {
	                zeroCount++;
	            }
	        }

	     
	        
	        System.out.println("Count of positive numbers: " + positiveCount);
	        System.out.println("Count of negative numbers: " + negativeCount);
	        System.out.println("Count of zero numbers: " + zeroCount);


	}

}
