// User se marks lenge — grade print karo:

// 90 → A

// 75 → B

// 50 → C

// else → Fail

import java.util.Scanner;

public class demo11
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("students marks:- ");
		System.out.println("enter your marks: " );
		int num = input.nextInt();

		if(num>90)
		{
			System.out.println("A grade");
		}
		else if(num>75)
		{
			System.out.println("B grade");
		}
		else if(num>50)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("you are a fail ");
		}

	}
}