class WhileDemo
{
    public static void main(String args[])
    {
        int i=1;

        while(i<=10)
        {
            System.out.println("hi " + i);

            int j = 1;
            while(j<=3)
            {
                System.out.println("hello " + j);
                j++;

            }

            i++;
        }
    }
}