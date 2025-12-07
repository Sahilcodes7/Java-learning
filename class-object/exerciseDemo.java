class calculator
{
	public int add(int n1,int n2,int n3)

	{
		return n1 + n2 + n3;
	}
}

 class exerciseDemo
{

	public static void main(String args[])

	{

		calculator obj= new calculator();

		int r1 = obj.add(n1:3,n2:4,n3:5); 

		System.out.println(r1);
	}
}