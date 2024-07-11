package Stringprgrms;

public class Oddeven {

	public static void main(String[] args) {

		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13};

        
        int evenCount = 0;
        int oddCount = 0;

        
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
	}

}
