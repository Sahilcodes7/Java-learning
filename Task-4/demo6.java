// User se 2 numbers lo aur unka + − × ÷ % result print karo.

import java.util.Scanner;

public class demo6
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("arithmetic operators:-");
		System.out.print("enter your first  number: ");
		int num = input.nextInt();
		System.out.print("enter your second number: ");
		int num1 = input.nextInt();

		int result = num+num1;
		int result1 = num-num1;
		int result2 = num*num1;
		int result3 = num/num1;
		int result4 = num%num1;

		System.out.println("number is a := " + result);
		System.out.println("number is a := " + result1);
		System.out.println("number is a := " + result2);
		System.out.println("number is a := " + result3);
		System.out.println("number is a := " + result4);


	}
}