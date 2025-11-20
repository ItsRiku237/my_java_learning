import java.util.Scanner;

public class J_18_InvertedHalfPyramidLoop {
    // 18 . Print inverted half pyramid .(n=4)
    // 1 1 1 1
    // 2 2 2
    // 3 3
    // 4

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();

        }
        sc.close();

    }
}
