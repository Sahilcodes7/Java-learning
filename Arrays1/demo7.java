// program to merge two sorted arrays

import java.util.Scanner;

public class demo7 {

    
    public static int[] mergeSortedArrays(int[] a, int[] b) {

        int[] result = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;

        
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        
        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        
        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // first array
        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        
        System.out.print("Enter size of second array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        int[] merged = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged sorted array:");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
