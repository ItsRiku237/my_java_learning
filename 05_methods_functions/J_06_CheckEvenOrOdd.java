import java.util.Scanner;

public class J_06_CheckEvenOrOdd {
    // Make a function to check if a number is prime or not.
    public static boolean checkPrimeOrNot(int a) {
        if (a <= 1)
            return false;// 0 and 1 are not prime
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) // divisible by some number
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int n = sc.nextInt();
        if (checkPrimeOrNot(n)) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }

    }

}
