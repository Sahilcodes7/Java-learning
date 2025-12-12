// create a program check if the number is armstrong

// 153= 1+5+3 ni 3 number that 1ni 3 power=1,5 ni 3=125, and 3 ni 3=27==153 that armstrong
import java.util.Scanner;

public class Armstrong
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("number is a Armstrong:");
		System.out.print("enter the number :");
		int num = input.nextInt();
		boolean isArmstrong=isArmstrong(num);
		System.out.println(isArmstrong);
		if(isArmstrong)
		{
			System.out.println("number is a Armstrong");

		}
		else{
			System.out.println("number is not a Armstrong");

		}


		

	}
	public static boolean isArmstrong(int num)
	{
		int noOfdigits=noOfdigits(num);
		int numcopy =num;
		System.out.println("no of digits is a  : " + noOfdigits);
		int finalnumber=0;
		
		while(num>0)
		{
			int lastdigit = num%10;
			num=num/10;
			finalnumber = finalnumber+ pow(lastdigit, noOfdigits);
		}
		System.out.println("final number is a:" + finalnumber);

		return finalnumber==numcopy;

	}
	public static int pow(int num1,int num2)
	{
		int result = 1;
		int i=0;
		while(i<num2)
		{
			result = result*num1;
			i++; 
		}
		System.out.println("power of : " +  num1  + "  is "+result);
		return result;


	}
	public static int noOfdigits(int num)
	{
		int digits = 0;
		while(num>0)
		{
			digits++;
			num=num/10;

		}
		return digits;

	}
}