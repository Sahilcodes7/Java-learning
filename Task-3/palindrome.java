// create a progra to veriify if a number is palindrome..
// first number se last number and last to first number are same:-101,32123 \
 // starting se and end se both are same:


import java.util.Scanner;

public class palindrome
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number is a palindrome :");
		System.out.println("enter the number: ");
		int num = input.nextInt();
		boolean ispalindrome = ispalindrome(num);
		if(ispalindrome)
		{
			System.out.println("number is a palindrome");
		}
		else 
		{
			System.out.println("number is not a palindrome");

		}
		
	}


	public static boolean ispalindrome(int num)
	{
		int reverse = reverse(num);
		return num==reverse;
	}
	public static int reverse(int num)
	{
		int newnum = 0;
		while(num>0)
		{
			int digit=num%10;
			newnum = newnum*10 + digit;
			num=num/10; 
		}

		return newnum;

	}
}