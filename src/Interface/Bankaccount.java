package Interface;

import java.util.Scanner;

interface bank
{
	public void accountdetails();
	public void balance();
	public void withdrawal();
	public void deposit();
	
	
}

class Fedralbank implements bank
{

	Scanner sc = new Scanner(System.in);
	static String bankname = "Fedralbank";
	int balance=40000;
	
	@Override
	public void accountdetails() {
		
	System.out.println("enter your accountno:");
	long accntno=sc.nextLong();
	System.out.println("your account number =" +accntno   + "     bank name     "+   bankname  );
	}

	@Override
	public void balance() {

		System.out.println(balance);
	}

	@Override
	public void withdrawal() {
		
		System.out.println("enter amount to withdraw");
		int withdrawalamnt=sc.nextInt();
		balance=balance-withdrawalamnt;
		System.out.println("your balance="+balance);
	}

	@Override
	public void deposit() {
		
		System.out.println("enter your deposit amount");
		int depositamnt=sc.nextInt();
		balance=balance+depositamnt;
		System.out.println("your balance="+balance);
		
	}
	
}
public class Bankaccount {

	public static void main(String[] args) {
		
     Fedralbank ob=new Fedralbank();
     ob.accountdetails();
     ob.balance();
     ob.withdrawal();
     ob.deposit();
	}

}
