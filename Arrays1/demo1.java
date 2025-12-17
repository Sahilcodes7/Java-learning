// create a program to find number of occurences of an elements in an array


import java.util.Scanner;

public class demo1 {

   
    public static int countOccurrence(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
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

        
        System.out.print("Enter element to find occurrences: ");
        int key = input.nextInt();

        int result = countOccurrence(nums, key);

        System.out.println("Number of occurrences of " + key + " = " + result);
    }
}
