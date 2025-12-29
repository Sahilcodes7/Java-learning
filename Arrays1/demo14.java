import java.util.Scanner;

public class demo14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];
        boolean isIdentity = true;

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                }
                if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                }
            }
        }

        if (isIdentity) {
            System.out.println("Matrix is an IDENTITY MATRIX.");
        } else {
            System.out.println("Matrix is NOT an identity matrix.");
        }
    }
}
