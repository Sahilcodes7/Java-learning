import java.util.Scanner;

public class ArraySearching
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int[] arr = {3,6,8,12,14,16,22,28,32,36,38};
		System.out.println("welcome to array searching \n");
		System.out.print("number search : ");

		int num = input.nextInt();
		boolean isfound= isfound(arr,num);
		if(isfound)
		{
			System.out.println("number is a found in the array ");
		}
		else 
		{
			System.out.println("number is not a found in the array ");
		}



	}
	public static boolean isfound(int[] arr,int num)
	{
		int index=0;
		while(index<arr.length)
		{
			if(arr[index]==num)
			{
				return true;

			}
			
			index++;
		}
		return false;
	}
}