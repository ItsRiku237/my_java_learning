public class J_03_HalfPyramid {
    // 3. print the pattern (Half Pyramid)
    // *
    // * *
    // * * *
    // * * * *
    public static void main(String[] args) {
        // ans: here i goes from 1 to n . when i= 1 then j= 1 ,when i= 2 then j= 1,2
        // ,when i= 3 then j 1,2,3, when
        // i = 4 then j = 1,2,3,4 .
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
