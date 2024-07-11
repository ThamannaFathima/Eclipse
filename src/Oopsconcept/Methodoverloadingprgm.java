package Oopsconcept;

public class Methodoverloadingprgm {

	public static void main(String[] args) {
		
		Methodoverloadingprgm ob= new Methodoverloadingprgm();
				
		ob.add();
		ob.add(60, 80);
		ob.add(30, 90);
		ob.add(90,79 );
	
	}
		public void add()
		{
			int a=60,b=80;
			int c=a+b;
			System.out.println(c);
					
		}
		
		public void add(int a,int b)
		{
			int c=a+b;
			System.out.println("c=" +c);
			
		}

		public void add(double a,int b)
		{
			double c= a+b;
			System.out.println("c=" +c);
		}
		
		public void add(int a,double b)
		{
			double c= a+b;
			System.out.println("c=" +c);
		}
		
	

}
