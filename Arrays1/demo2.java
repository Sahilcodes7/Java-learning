// create a program to find the max and min element is an array.

import java.util.Scanner;

public class demo2 {

    
    public static int findMax(int[] arr) {
        int max = arr[0];   // assume first element is max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    
    public static int findMin(int[] arr) {
        int min = arr[0];   // assume first element is min
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

        int max = findMax(nums);
        int min = findMin(nums);

        System.out.println("Maximum element = " + max);
        System.out.println("Minimum element = " + min);
    }
}
