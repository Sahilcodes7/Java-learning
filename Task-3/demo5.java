// create a program  find the least common multiple (LCM) of two number..

// 15 and 20 == 60


import java.util.Scanner;


public class demo5
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("LEAST OF COMMON MULTIPLE ");
		System.out.print("enter the first  number :- ");
		int first = input.nextInt();
		System.out.print("enter the second  number :- ");
		int second = input.nextInt();
		int lcm =lcm(first,second);
		System.out.println("multiple number is a :- " + lcm); 
	}
	public static int lcm(int first ,int second)
	{
		int i = 1;
		while (true)
		{
			int factor = first*i;
			if(factor %second==0)
			{
				return factor;
			}
			i++;
		}

	}

} 