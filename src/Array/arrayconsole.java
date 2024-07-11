package Array;

import java.util.Scanner;

public class arrayconsole {

	public static void main(String[] args) {

		
		int[] ar= new int[3];
		System.out.println("eneter numbers");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			ar[i]= sc.nextInt();
		}
		
		System.out.println("eneterd numbers");
		for(int  i=0;i<3;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
