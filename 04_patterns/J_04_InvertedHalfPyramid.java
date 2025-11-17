public class J_04_InvertedHalfPyramid {
    // 4. print the pattern (Inverted half Pyramid)
    // * * * *
    // * * *
    // * *
    // *
    public static void main(String[] args) {
        // ans: Here i goes from 1 to n but j goes from (n-i) to 0.
        // another way when i goes from n to 1 and j goes from 1 to i .
        // when i= 4 then j=1 to i ,when i= 3
        // then j= 1 to i
        // ,when i= 2 then j = 1 to i, when
        // i =1 then j = 1 to i.
        int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = (n-i); j >=0; j--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
