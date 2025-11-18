public class J_09_ZeroOneTriangle {
    // 9 . print the pattern (0-1 Triangle)
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1
    public static void main(String[] args) {
        // ans: Here i goes from 1 to n and j goes from 1 to i --> print 1 to i value in row .
        //when i+j= even number then print '1' and odd then print '0' .
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                int add = i + j;
                if (add % 2 == 0) { // even
                    System.out.print("1 ");
                } else { // odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}
