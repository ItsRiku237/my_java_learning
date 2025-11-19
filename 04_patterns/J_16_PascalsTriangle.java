import java.util.Scanner;

public class J_16_PascalsTriangle {
    // 16. Print a pascals triangle .(n=5)
    //       1  
    //      1 1 
    //     1 2 1 
    //    1 3 3 1
    //   1 4 6 4 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // print leading space
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            // inner loop
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();

        }
        sc.close();

    }

}
