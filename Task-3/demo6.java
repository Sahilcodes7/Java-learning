// create a program find the great common divisor(GCD) of two integer..java.net.
// dono number ko divide karna padega..sabse badi


import java.util.Scanner;

public class demo6
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("GCD OF TWO NUMBER..");

		System.out.print("enter first number:- ");
		int first = input.nextInt();
		System.out.print("enter second number:- ");
		int second = input.nextInt();
		int GCD = GCD(first,second);
		System.out.println("GCD number is a :-  " + GCD);

	}
	public static int GCD(int first,int second)
	{
		int GCD = 1;
		int i = 2;
		int  least = least(first,second);
		while(i<= least)
		{
			if(first%i==0 && second %i==0)
			{
				GCD = 1;
			}
			i++;
		}

		return GCD;
		

	}
	public static int least(int first, int second)
	{
		if(first<second)
		{
			return first;
		}
		else{
			return second;
		}
	}

}