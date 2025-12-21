// create a program to check is the array is palindrome or not..



import java.util.Scanner;

public class demo6 {

 
    public static boolean isPalindrome(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;   
            }
            start++;
            end--;
        }
        return true;  
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] nums = new int[size];

        // array input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }

        if (isPalindrome(nums)) {
            System.out.println("The array is a PALINDROME.");
        } else {
            System.out.println("The array is NOT a PALINDROME.");
        }
    }
}
