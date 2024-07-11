package Encapsulation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class EncpTryCatch {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream f= new FileInputStream("E: \\book1.x1sx");
		
		try
		{
			int a=40, b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("arithmetic exception");
		}
		System.out.println("hello");
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("null point exception");
		}
		System.out.println("hai");

	}

}
