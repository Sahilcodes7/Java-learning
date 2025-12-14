// Loops

// 1 se 100 tak numbers print karo.

import java.util.Scanner;

public class demo16
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("1 to 100 number print..");
		System.out.print("enter your number : ");
		int num = input.nextInt();
		System.out.println("your number is a : ");

		int i = 1;
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}

	}
	
}