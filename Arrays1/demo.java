// create a program find the sum and avg of all element Array.

import java.util.Scanner;

public class demo {

   
    public static long sum(int[] numArray) {
        long sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        return sum;
    }

   
    public static double avg(int[] numArray) {
        long sum = sum(numArray);
        return (double) sum / numArray.length;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] nums = new int[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }

        long total = sum(nums);
        double average = avg(nums);

        System.out.println("Sum of elements = " + total);
        System.out.println("Average of elements = " + average);
    }
}

