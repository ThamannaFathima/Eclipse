package Array;

import java.util.Scanner;

public class Tofetch {

	public static void main(String[] args) {
		String[] st= new String[3];
		System.out.println("eneter name");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			st[i]= sc.next();
		}
		
		System.out.println("eneterd names");
		
		for(String v:st)
		{
			System.out.println(v);
		}

	}

}