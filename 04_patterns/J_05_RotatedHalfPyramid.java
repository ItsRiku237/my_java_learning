public class J_05_RotatedHalfPyramid {
    // 5 . print the pattern (Inverted & Rotated Half Pyramid)
    //       *
    //     * *
    //   * * *
    // * * * *
    public static void main(String[] args) {
        // ans: Here i goes from 1 to n but j goes from 1 to (n-1)--> space print and j goes
        // from 1 to i --> * print.
        int n = 4;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> space print
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // inner loop -> * print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
