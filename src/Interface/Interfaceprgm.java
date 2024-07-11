package Interface;



interface car1
{
	public void acceleration();
	public void speedlimit();
	
}

interface carshop
{
	
}
class BMW implements car1
{

	@Override
	public void acceleration() {
		System.out.println("BMW acceleration");
	}

	@Override
	public void speedlimit() {
		System.out.println("BMW speedlimit");

		
	}
	class Benz implements car1
	{

		@Override
		public void acceleration() {
			System.out.println("Benz acceleration");

			
		}

		@Override
		public void speedlimit() {
			System.out.println("Benz acceleration");

		}
		
	}
}
public class Interfaceprgm {

	public static void main(String[] args) {
		
		BMW ob=new BMW();
		ob.acceleration();
		ob.speedlimit();
		
	  
	}

}
