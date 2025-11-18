public class J_06_HalfPyramidNumbers {
    // 6 . print the pattern (Half Pyramid with Numbers)
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void main(String[] args) {
        // ans: Here i goes from 1 to n and j goes from 1 to i --> print 1 to i .
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
