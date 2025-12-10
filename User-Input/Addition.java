// create a program to add 2 number:

import java.util.Scanner;

public class Addition
{
	public static void main(String args[])
	{

		Scanner input = new Scanner(System.in);

		System.out.println("welcome to our calculator :");           // just a 

		System.out.print("Enter your first number:- ");             //input

		int firstnumber = input.nextInt();                         

		System.out.print("Enter your second number:- ");

		int secondnumber = input.nextInt();

		int sum = firstnumber+ secondnumber;

		System.out.println("sum of number is a : " + sum);
	}
}