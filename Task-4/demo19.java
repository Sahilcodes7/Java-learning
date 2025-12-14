// 10 numbers input karo — unka sum print karo.

import java.util.Scanner;


public class demo19
{
	public static void main(String args[])
	{
		Scanner input =new Scanner(System.in);
		System.out.println("10 number sum AND print :");
		System.out.print("enter your number : ");
		int num = input.nextInt();
		int sum = sum(num);
		System.out.println("sum  is a : " + sum);


	}
	public static int sum(int num)
	{
		Scanner input = new Scanner(System.in);

		int i =1;
		int sum = 0;
		while(i<=num)
		{
			System.out.println("number is a  " + i + ":");
			int n = input.nextInt();
			sum = sum+n ;
			i++;
		}
		return sum;

	}

	
}