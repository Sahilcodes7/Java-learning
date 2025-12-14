// electricity bill calculator:

// 0–100 → ₹5/unit

// 101–200 → ₹7/unit

// above 200 → ₹10/unit

import java.util.Scanner;

public class demo13
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("electricity bill calcu ");
		System.out.print("enter  your bill ");
		int bill = input.nextInt();

		if(bill>=0 && bill<=100)
		{
			System.out.println( bill + " your bill is a 5$ per  unit");
		}
		if(bill>=101 && bill<=200)
		{
			System.out.println( bill + " your bill is a 7$ per  unit");
		}
		if(bill>200)
		{
			System.out.println( bill + " your bill is a 10$ per  unit");
		}
	}
}