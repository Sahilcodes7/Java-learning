// Check karo ki entered year leap year hai ya nahi.
// 400,4,100

import java.util.Scanner;

public class demo12
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("find leap year:" );
		System.out.print("enter your year: ");
		int year = input.nextInt();

		if(year%400==0)
		{
			System.out.println("your year is leap year");
		}
		else if(year%100==0)
		{
			System.out.println("year is not  a leap year");
		}
		else if(year%4==0)
		{
			System.out.println("year is  a leap year");
		}
		else 
		{
			System.out.println("is not a leap year");
		}
	}
}