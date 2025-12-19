// create a program to return a new array deleting specific element

import java.util.Scanner;

public class demo4 {

    public static int[] deleteElement(int[] arr, int key) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                count++;
            }
        }

        
        int[] newArr = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                newArr[index] = arr[i];
                index++;
            }
        }

        return newArr;
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

        System.out.print("Enter element to delete: ");
        int key = input.nextInt();

        int[] result = deleteElement(nums, key);

        System.out.println("New array after deleting " + key + ":");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
