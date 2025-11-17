public class J_02_HollowRectangle {
    // 2. print the pattern (Hollow Rectangle)
    // *****
    // *   *
    // *   *
    // *****
    public static void main(String[] args) {
        // ans: only outter boundary contains *.
        // that means which are contains i=1, j=1, i=n,j=m are prints.
        int n = 4;
        int m = 5;
        // OUTER LOOP
        for (int i = 1; i <= n; i++) {
            // INNER LOOP
            for (int j = 1; j <= m; j++) {
                //cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    // ||--> 'or' 'any one is satisfied then loop is executed'
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
