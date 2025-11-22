import java.util.*;

public class J_10_GreaterOfTwoNumbers {
    // Exercise 1

    // 2. Write a function to print the sum of all odd numbers from 1 to n.

    public static void sumOfOddNo(int x) {

        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd number is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number  :");
        int n = sc.nextInt();
        sumOfOddNo(n);

    }

}
