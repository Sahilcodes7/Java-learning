import java.util.Scanner;

public class pattern
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("print to the pattern");
		System.out.println("enter pattern number: ");
		int rows =input.nextInt();
		printFirstPattern(rows);



		printSecondPattern(rows);

		printThirdPattern(rows);

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

	public static void printFirstPattern(int maxrows)
	{
		System.out.println("Right Half Pyramid");


		// System.out.println("*");
		// System.out.println("* *");
		// System.out.println("* * *");
		// System.out.println("* * * *");
		// System.out.println("* * * * *");


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
		
	public static void printThirdPattern(int maxrows)
	{
		System.out.println("\n left  Half Pyramid");
		int rows =maxrows;
		while(rows>0)

		{
			int j = 0;
			while(j<rows-1)
			{
				System.out.print("  ");
				j++;
			}
			int i=0;
			while(i <= (maxrows - rows))
			{
				System.out.print("* ");
				i++;
			} 

			System.out.println();
			rows--;
		}
	}

	}




