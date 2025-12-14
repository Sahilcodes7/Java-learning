// 1 se 50 tak even numbers print karo

import java.util.Scanner;

public class demo17
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("1 to 50 even number : ");
		System.out.print("enter your number : ");
		int num = input.nextInt();

		int i = 1;
		while(i<=num)
		{
			if(i %2==0)
			{
				System.out.println(i+  " number is a even");
			}
			
			i++;
		}

	}
}