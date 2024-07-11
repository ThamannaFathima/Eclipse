package welcome;

public class Swappingwithoutvar {

	public static void main(String[] args) {

		
		int x=40;
		int y=50;
		
		System.out.println("before swapping");
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
		x = x+y;
		y= x-y;
		x= x-y;
		
		System.out.println("after swapping");
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
