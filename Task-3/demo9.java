// create a program to print fibonacci series up to a certain number:
// 0,1,1,2,3,6,8,13,21 == 0+1=1.1+2=3   aage and piche wala number +


import java.util.Scanner;

public class demo9
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the fibonacci series:");
		System.out.print("enter the number:- ");
		int num = input.nextInt();
		System.out.println("number is a fibonacci : ");
		fibonacci(num);

	}
	public static void  fibonacci(int num)
	{
		if(num<0) return;
			System.out.print(" 0 "); 
		if (num==0) return;
		{
			System.out.print(" 1  "); 
		}
		int first = 0 ,second = 1;
		while(first + second <= num)`
		{
			int third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;

		}

	}
}