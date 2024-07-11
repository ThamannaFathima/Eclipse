package Stringprgrms;

public class Stringprogramss {

	public static void main(String[] args) {

		
		String s1= "hello";
		String s2= "How are you";
		String s3= "What are you doing";
		String s4= new String("HELLO");
		
		//concat
		
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+3+4);
		
		//equals
		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		//touppercase
		//tplowercase
		
		System.out.println(s2.toUpperCase());
		System.out.println(s4.toLowerCase());
		
		//length
		
		System.out.println(s3.length());
		
		//startwith
		//endwith
		
		System.out.println(s3.startsWith("What"));
		System.out.println(s2.endsWith("you"));
		
		//trim
		System.out.println(s3.trim());
		
		//replace
		System.out.println(s3.replace("doing", "making"));
		
		//contains
		
		System.out.println(s3.contains("What"));
		
		//split
		
		String[] ar=s3.split(" ");
		
		for(String a:ar)
		{
			  System.out.println(a);
		}
		
		//substring
		System.out.println(s3.substring(1,6));
		
		//charAt
		
		System.out.println(s1.charAt(2));
		
		//tocharArray
		
		char[] c=s1.toCharArray();
		for(char c1:c)
		{
			System.out.println(c1);	
		}
	}

}
