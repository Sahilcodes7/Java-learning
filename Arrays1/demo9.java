// create a program to do sum and avg of all element in 2-d array.

import java.util.Scanner;

public class demo9 {

    public static int sum(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {          
            for (int j = 0; j < arr[i].length; j++) {   
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

 
    public static double avg(int[][] arr) {
        int totalElements = 0;

        for (int i = 0; i < arr.length; i++) {
            totalElements = totalElements + arr[i].length;
        }

        int totalSum = sum(arr);
        return (double) totalSum / totalElements;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        // input 2-D array
        System.out.println("Enter elements of 2-D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        int totalSum = sum(matrix);
        double average = avg(matrix);

        System.out.println("Sum of all elements = " + totalSum);
        System.out.println("Average of all elements = " + average);
    }
}
