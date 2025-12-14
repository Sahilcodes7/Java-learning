// ATM withdrawal logic — agar balance kam hai to "Insufficient funds" print karo.

import java.util.Scanner;

public class demo15
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("ATM Withdrawal");
		System.out.print("enter your amount : ");
		long balance = input.nextLong();
		System.out.println( "your balanced is a  " + balance );

		if(balance<=200)
		{
			System.out.println("your amout is a insufficient ");
		}
		else 
		{
			System.out.println("your amout is not a insufficient ");
		}
		
	}

}