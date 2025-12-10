import java.util.Scanner;

public class Demo
{
	public static void main(String args[])
	{

		Scanner input = new Scanner (System.in);
		System.out.print("enter your name:");
		String name = input.nextLine();
		System.out.println("Welcome" +   name);

		System.out.print(name + ", Also tell me your age: ");
		int age = input.nextInt();

		System.out.println("your age is a :"+  age);
			
	}
}