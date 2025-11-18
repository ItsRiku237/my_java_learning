public class J_08_FloydsTriangle {
    // 8 . print the pattern(Floyd's Triangle)
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15
    public static void main(String[] args) {
        // ans: Here i goes from 1 to n and j goes from 1 to (n-i+1) --> print 1 to i .
        int n = 5;
        int number = 1;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // number = number + 1
            }
            System.out.println();
        }

    }
}
