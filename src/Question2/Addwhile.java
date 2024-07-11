package Question2;

import java.util.Scanner;
public class Addwhile {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        char choice;

	        do {
	            
	            System.out.print("Enter the first number: ");
	            int num1 = sc.nextInt();
	            System.out.print("Enter the second number: ");
	            int num2 = sc.nextInt();

	            
	            int sum = num1 + num2;

	            
	            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

	            
	            System.out.print("Do you want to perform the operation again? (Y/N): ");
	            choice = sc.next().charAt(0);
	        } while (choice == 'Y' || choice == 'y');

	        
	}
}
	


