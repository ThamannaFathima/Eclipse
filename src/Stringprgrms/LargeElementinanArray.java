package Stringprgrms;

public class LargeElementinanArray {

	public static void main(String[] args) {

		int[] array = {34, 78, 56, 89, 23, 67, 45};

        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
	}

}
