import java.util.Scanner;

public class demo16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements (1 to " + (n + 1) + ", one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int expectedSum = (n + 1) * (n + 2) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number = " + missingNumber);
    }
}
