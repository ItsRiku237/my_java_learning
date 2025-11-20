import java.util.Scanner;

public class J_17_HalfPyramidLoop {
    // 17 . Print half pyramid .(n=5)
    // 1
    // 1 2       
    // 1 2 3     
    // 1 2 3 4   
    // 1 2 3 4 5 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");//we can j to print in place of value .
                value++;
            }

            System.out.println();

        }
        sc.close();

    }

}
