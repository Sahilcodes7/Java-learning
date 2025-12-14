// Teen numbers me se maximum find karo using relational operators.

import java.util.Scanner;

public class demo8
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("find max number :- ");
		System.out.print("enter your first  number:");
		int first = input.nextInt();
		System.out.print("enter your second number:");
		int second = input.nextInt();
		System.out.print("enter your third number:");
		int third = input.nextInt();
		if(first>second && first>third)
		{
			System.out.println("first number is a greather : " + first);
		}
		else if(second>third) 
		{
			System.out.println("second number is a greather : " + second);
		}
		else 
		{
			System.out.println("third number is a greather : " + third);
		}

	}
}