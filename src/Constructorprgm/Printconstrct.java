package Constructorprgm;

public class Printconstrct {
	String s;

	
	public Printconstrct(String s) {
		
		this.s=s;
		
	}
	public static void main(String[] args) {

		Printconstrct emp=new Printconstrct("hello");
		System.out.println(emp.s);
	}

}
