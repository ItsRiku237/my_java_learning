import java.util.Scanner;

public class J_02_SumOfNaturalNumbers {
    // print the 1st n natural number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i ;  //same as  ==> sum = sum + i;
        }
        System.out.println(sum);

    }
}
