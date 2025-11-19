public class J_12_PalindromeNumberPyramid {
    // 13. Print a number pyramid.
    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> print space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }//1st half numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
