public class J_11_NumberPyramid {
    
    // 12. Print a number pyramid.
    //     1
    //    2 2
    //   3 3 3
    //  4 4 4 4
    // 5 5 5 5 5
    public static void main(String[] args) {
        int n = 5;
        // int number = 1;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> print space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // System.out.print(number + " "); // This is also a way.
                System.out.print(i+ " ");
            }
            // number++;
            System.out.println();
        }
    }
}
