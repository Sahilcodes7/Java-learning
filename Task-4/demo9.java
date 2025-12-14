// Logical operators ka use karke check karo:

// number 1 se 100 ke beech hai ya nahi

import java.util.Scanner;

public class demo9
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("find 1 to 100 beech ka number : ");
		System.out.print("enter the number : ");
		int num = input.nextInt();
		System.out.println("number is a : " +num);


		if(num >=1 && num<=100)
	{
		System.out.println("number is between 1 to 100");
	}
		else 
	{
		System.out.println("number is not a 1 to 100 ");
	}

	}
	
}