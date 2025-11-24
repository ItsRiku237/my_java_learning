import java.util.Scanner;

public class J_03_2d_array_spiral_order
 {
    // Take a matrix as a input from the user.Search for a given number x and print
    // the index which it occurs.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows :");
        int row = sc.nextInt();
        System.out.println("Enter number of columns :");
        int cols = sc.nextInt();

        int numbers[][] = new int[row][cols];
        System.out.println("Enter element of the array :");

        // row
        for (int i = 0; i < row; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number which index is find :");
        int num = sc.nextInt();
        // row
        for (int i = 0; i < row; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                if (num == numbers[i][j]) {
                    System.out.print("Number found at index (" + i + "," + j + ")");
                }
            }
        }
    }
}
