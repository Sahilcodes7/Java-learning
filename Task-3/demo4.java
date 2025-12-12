// create a program the computer the sum of digit integer 555==5+5+5=15

import java.util.Scanner;

public class demo4
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("sum of digits:");
		System.out.println("enter the number:- ");
		int num = input.nextInt();
		int sum = sumOfDigit(num);
		System.out.println("sum of digit is a : " + sum);
	}

	public static int sumOfDigit(int num)
	{
		int sum = 0;
		while (num>0)
	{
		sum = sum + (num%10);
		num= num/10;


	}
	
		return sum;
	}

	

}

