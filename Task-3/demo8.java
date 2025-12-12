// create a program to reverse the digit of the number..420===024 reverse

import java.util.Scanner;

public class demo8
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number is a reverse :");
		System.out.println("enter the number: ");
		int num = input.nextInt();
		int reverse = reverse(num);
		System.out.println("number is a reverse: "+ reverse);
	}
	public static int reverse(int num)
	{
		int newnum = 0;
		while(num>0)
		{
			int digit=num%10;
			newnum = newnum*10 + digit;
			num=num/10; 
		}

		return newnum;

	}
}