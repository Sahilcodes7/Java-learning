// Number ka factorial calculate karo. 4=4*3*2*1=24   4!

import java.util.Scanner;

public class demo18
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("find factorial number: ");
		System.out.print("enter your number : ");
		int num = input.nextInt();

		long fact = factorial(num);
		System.out.println("factorial is a : " + fact);

	
	}
	public static long factorial(int num)
	{
		if(num<2)
		{
			return 1;
		}
		long fact = 1;
		int i=2;
		while(i<=num)
		{
			fact = fact*i;
			i++;
		}
		return fact;
	}
}

