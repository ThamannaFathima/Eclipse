package controlstmnts;

public class Nestedif {

	public static void main(String[] args) {

		
	int age=18,weight=53;
	if(age>=18)
	{
		if(weight>=55)
		{
			System.out.println("elegible for blood donation");
			
		}
		else {
			System.out.println("not elegible minimum weight is 55");
		}
	}
	else
	{
		System.out.println("not elegible");
	}
	}

}
