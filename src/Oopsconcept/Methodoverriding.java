package Oopsconcept;


class College
{
	public void course()
	{
		System.out.println("Course name");
	}
}

class student extends College
{

	@Override
	public void course() {
		System.out.println("B.voc software development and system administration");
		super.course();
	}
	
}



public class Methodoverriding {

	public static void main(String[] args) {
		
		
		student ob = new student();
		ob.course();

	}

}
