package Question2;

public class Triangle {

	public static void main(String[] args) {
		
		int n=10;
		int fnumber=0,snumber=1,tnumber;
			for (int i=0;i<=n;i++)
			{
				System.out.print(fnumber+",");
				tnumber=fnumber+snumber;
				fnumber=snumber;
				snumber=tnumber;
				System.out.print(fnumber+",");
				
			}
	     

	}

}
