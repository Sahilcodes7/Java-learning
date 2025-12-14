// Celsius ko Fahrenheit me convert karne ka program likho.


import java.util.Scanner;

public class demo3
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("calcuis to fahrenheit converter:- ");
		System.out.print("enter the calcuis number:");
		float fah = input.nextFloat();
		float celsius = (fah-32) *5/9;

		System.out.println("number is a fahrenheit " + celsius);
	}

}