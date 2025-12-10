// create a program to input the person respond  with "welcome"
// name to sahil

import java.util.Scanner;

public class Task
{

	public static void main(String args[])

	{
		Scanner input = new Scanner(System.in);


		System.out.print("Enter Your Name:   -   ");

		String name = input.nextLine();

		System.out.println("welcome "   +   name);

		System.out.print(name + ", also tell me a age:-");



		int age=input.nextInt();

		System.out.println( "Your age is a:- "   + age);



		}
}