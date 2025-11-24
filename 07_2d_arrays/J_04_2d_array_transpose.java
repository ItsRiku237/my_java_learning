import java.util.Scanner;

public class J_04_2d_array_transpose
 {
    // Q4 . Print the spiral order matrix as output for a given matrix of numbers.

    public static void main(String[] args) {
        //small correction are required.

        // APPROACH :
        // Algorithm: (We are given a 2D matrix of n X m ).
        // 1. We will need 4 variables:
        // a. row_start - initialized with 0.
        // b. row_end - initialized with n-1.
        // c. column_start - initialized with 0.
        // d. column_end - initialized with m-1.
        // 2. First of all, we will traverse in the row row_start from column_start
        // Apna College
        // to column_end and we will increase the row_start with 1 as we have
        // traversed the starting row.
        // 3. Then we will traverse in the column column_end from row_start to
        // row_end and decrease the column_end by 1.
        // 4. Then we will traverse in the row row_end from column_end to
        // column_start and decrease the row_end by 1.
        // 5. Then we will traverse in the column column_start from row_end to
        // row_start and increase the column_start by 1.
        // 6. We will do the above steps from 2 to 5 until row_start <= row_end
        // and column_start <= column_end.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row number :");
        int m = sc.nextInt();
        System.out.println("Enter Column number :");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Enter Element of the matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print the spiral order matrix : ");

        int row_start = 0;
        int row_end = m - 1;
        int column_start = 0;
        int column_end = n - 1;

          // To print spiral order matrix
        while (row_start <= row_end && column_start <= column_end) {
            for (int col = row_start; col <= column_end; col++) {
                System.out.print(matrix[row_start][col] + " ");
            }
            row_start++;

            for (int row = row_start; row <= row_end; row++) {
                System.out.print(matrix[row][column_end] + " ");
            }
            column_end--;

            for (int col = column_end; col >= column_start; col--) {
                System.out.print(matrix[row_end][col] + " ");
            }
            row_end--;

            for (int row = row_end; row >= row_start; row--) {
                System.out.println(matrix[row][column_start] + " ");
            }
            column_start++;

        }

    }
}
