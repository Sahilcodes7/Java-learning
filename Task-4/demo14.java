// Character input lo — check karo vowel hai ya consonant.

import java.util.Scanner;

public class demo14
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("check char is vowol or consonant");
		System.out.print("enter your Character : ");
		char ch = input.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.println(ch + "is a vowel");

		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch + " is a consonant");
		}
		else 
		{
			System.out.println("not a alphabet");
		}


	}
}