package Question2;



class Vehiclee
{
	public void drive()
	{
		System.out.println("vehicle name");
	}
}

class car extends Vehiclee
{

	
	@Override
	public void drive() {
		System.out.println("car is BMW");
		super.drive();
	}

	}
	


public class Vehicle {

	public static void main(String[] args) {
		
		car ob= new car();
		ob.drive();

	}

}
