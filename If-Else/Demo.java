public class Demo
{
	public static void main(String args[])
	{
		boolean ismale = true;

		String name = "bob";

		System.out.println("before if");
		if(ismale)
		{
			System.out.println("mr. " + name);

		}
		else 
		{
			System.out.println("ms." + name);
		}
		System.out.println("after if");


		boolean isseniorcitizen = true;
		boolean isAnAdult =false;

		if(isseniorcitizen)
		{
			System.out.println("hello senior citizen..");

		}
		else{
			if(isAnAdult)
			{
				System.out.println("are you Adult");

			}
			else{
				System.out.println("are you child");
			}
		}

	}
}