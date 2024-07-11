package Javaexm;

public class DuplicateElements {

	public static void main(String[] args) {
		
		
		int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9}; 

        System.out.println("Duplicate elements in the array:");

  
        for (int i = 0; i < numbers.length; i++) {
           
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                    
                }  
            }
        }
	}

}
