// Reverse star pattern:

// *****
// ****
// ***
// **
// *

import java.util.Scanner;

public class reverseStar
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("reverse pattern");
		System.out.print("enter your number : ");
		int rows =input.nextInt();
		printSecondPattern(rows);


	} 

	public static void printSecondPattern(int maxrows)
	{
		System.out.println("\nReverse Right Half Pyramid");
		int rows =maxrows;
		while(rows>0)
		{
			int i=0;
			while(i<rows)
			{
				System.out.print(" *");
				i++;
			}

			System.out.println();
			rows--;
		}
	}
}



