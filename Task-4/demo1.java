// Ek program banao jo user se name, age, aur salary input le aur unko print kare.

import java.util.Scanner;

public class demo1
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter your name: ");
		String name = input.nextLine();
		System.out.println("your name is a : "+ name);
		System.out.print("enter your age: ");
		int age = input.nextInt();
		System.out.println("your age is a : "+ age);
		System.out.print("enter your salary: ");
		long salary = input.nextLong();
		System.out.println("your salary is a : "+ salary);

	}
	
}