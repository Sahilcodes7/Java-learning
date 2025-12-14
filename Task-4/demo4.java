// Area of circle calculate karo (radius user input).  3.14*r*r

import java.util.Scanner;

public class demo4
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Area of circule:- ");
		System.out.print("enter your radius:");
		double radius = input.nextDouble();
		double area = Math.PI*radius  * radius;
		System.out.println("area of circle is a : " + area);

	}
}