import java.util.Scanner;

public class J_05_CheckPrime {
    // find the factorial of a number .
    public static void calculatefact(int a) {
        int fact = 1;
        if (a < 0) {
            System.out.println("Factorial is not defined .");
            return;
        }
        for (int i = a; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial is :" + fact);
        // in void data type we write return or not both are work.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int n = sc.nextInt();
        calculatefact(n);

    }

    // Another method :

    // public static int calculatefact(int a) {
    // int fact = 1;
    // for (int i = a; i >= 1; i--) {
    // fact = fact * i;
    // }
    // return fact;

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter value of a :");
    // int n = sc.nextInt();
    // if (n >= 0) {
    // System.out.println("Factorial is :" + calculatefact(n));
    // } else {
    // System.out.println("Factorial is not defined .");
    // }

    // }
}
