public class J_14_DiamondPattern {
    // 14. Print a Diamond pattern.(n=4)
    //      * 
    //    * * *
    //  * * * * *
    // * * * * * *
    // * * * * * *
    //  * * * * *
    //    * * *
    //      * 
    //Here space between the star but we print without space.
    public static void main(String[] args) {
        int n = 4;

        // upper half
        for (int i = 1; i <= n; i++) {
            // inner loop -> print space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            } // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //flip upper half of row we get lower half
        for (int i = n; i >= 1; i--) {
            // inner loop -> print space
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            } // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
