// create a program to check weather a given number is prime..2,3,5,7,11,13



import java.util.Scanner;

public class demo7
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number is prime: ");
		System.out.print("enter your number:- ");
		int num = input.nextInt();
		boolean primNum= primNum(num);
		if(primNum)
		{
			System.out.println("your number is prime");
		}
		else 
		{
			System.out.println("number is not a prime");
		}
		
	}
	public static boolean primNum(int num)
	{
		int i = 2;
		while(i<num)
		{
			if(num%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}
	
}