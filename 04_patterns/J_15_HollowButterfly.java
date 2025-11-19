import java.util.*;

public class J_15_HollowButterfly {
    // 15. Print a Hallow Butterfly .(n=5)
    // *        *
    // **      **
    // * *    * *
    // *  *  *  *
    // *   **   *
    // *   **   *
    // *  *  *  *
    // * *    * *
    // **      **
    // *        *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        // upper half
        for (int i = 1; i <= n; i++) {
            // inner loop ->left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // print space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // flip upper half of row we get lower half
        // lower half
        for (int i = n; i >= 1; i--) {
            // inner loop ->left wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // print space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right wing
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
