// Increment/decrement ka output predict karo:

import java.util.Scanner;

public class demo10
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number is increment and decrement : ");
		System.out.print("enter your first number : ");
		int num1 = input.nextInt();
		System.out.println("number is a : " + num1);
		System.out.print("enter your second number : ");
		int num2 = input.nextInt();
		System.out.println("number is a : " + num2);

		int result1 = num1++ + ++num1 + num1--;
		System.out.println("result is a first number : " + result1);

		int result2 = ++num2 + num2-- +  num2++;
		System.out.println("result is a second number : " + result2);


	}
}