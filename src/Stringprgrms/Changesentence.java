package Stringprgrms;

public class Changesentence {

	public static void main(String[] args) {

		
		String s= "Testing Training center";
		
		String[] ar=s.split(" ");
		
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
