package Javaexm;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 

        System.out.println("Even numbers:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("\nOdd numbers:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

	}

}
