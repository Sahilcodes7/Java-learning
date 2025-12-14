// Check karo: agar number 5 se divisible hai to "Yes" print karo, warna "No".

import java.util.Scanner;

public class demo7
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number and check number is divide 5: ");
		System.out.print("enter your number : ");
		int num = input.nextInt();
		System.out.println("number is a : " +num);
		if(num%5==0)
		{
			System.out.println("YES , number is divide");
		}
		else 
		{
			System.out.println("NO , number is not  divide");

		}

	}
}