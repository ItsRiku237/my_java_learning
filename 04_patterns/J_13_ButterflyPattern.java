public class J_13_ButterflyPattern {
    // Q10. Print the pattern (Butterfly pattern)
    // *           *
    // * *       * *
    // * * *   * * *
    // * * * * * * *
    // * * * * * * *
    // * * *   * * *
    // * *       * *
    // *           *  
    public static void main(String[] args) {
        int n = 4 ; //we are take any no to make a buttrfly . 
      
        // // outer loop
        // for (int i = 1; i <= n; i++) {
        // // inner loop -> print space
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2*(n - i); j++) {
        // System.out.print(" ");
        // }

        // // for (int j = 1; j <= (n - i); j++) {
        // // System.out.print(" ");
        // // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // // horizontal semmetry
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i + 1); j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <2*i; j++) {
        // System.out.print(" ");
        // }

        // // for (int j = 1; j <i; j++) {
        // // System.out.print(" ");
        // // }
        // for (int j = 1; j <= (n - i + 1); j++) {
        // System.out.print("*");
        // }
        //This upper code is also valid and correct .
        //But lower one is easy .when we make lower half we only reverse value of i from n to 1 .
        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            } // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
