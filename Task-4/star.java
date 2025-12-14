// Star pattern:

// *
// **
// ***
// ****
// *****

import java.util.Scanner;

public class star

{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number : ");
		System.out.print("enter the number : ");
		int rows = input.nextInt();
		printStarPattern(rows);

	}
	public static void printStarPattern(int maxrows) 
	{
		int rows = 0;
		while(rows<maxrows)
		{
			
			System.out.print("*"); 

			int i = 0;
			while(i< rows)
			{
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows++ ;
		}
	
	}
}