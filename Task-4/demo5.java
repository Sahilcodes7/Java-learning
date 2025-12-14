// ek variable me number store karke check karo ki vo even hai ya odd.

import java.util.Scanner;

public class demo5
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number is a odd and even find:");
		System.out.print("enter your number:-");
		int num = input.nextInt();
		if(num%2==0)
		{
			System.out.println("number is a even :-" + num);
		}
		else 
		{
			System.out.println("number is a odd : " + num);
		}
	}
}