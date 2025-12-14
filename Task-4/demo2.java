// 3 variables (int a=10, b=20, c=30) ka sum, average, product print karo.

import java.util.Scanner;

public class demo2
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("3 variable sum,avg..");
		System.out.print("enter a value :- ");
		int a = input.nextInt();
		System.out.println("a is a :" + a);
		System.out.print("enter b value :- ");
		int b = input.nextInt();
		System.out.println("b is a :" + b);
		System.out.print("enter c value :- ");
		int c = input.nextInt();
		System.out.println("c is a :" + c);

		int sum = a+b+c;
		System.out.print("sum of 3 variable is a : " + sum);

		int avg = (a+b+c)/3;
		System.out.print("avg of 3 variable is a : " + avg);
	}
}