import java.util.Scanner;

public class J_09_PrimeNumberCheck {
    // Qs. Print if a number is prime or not (Input n from the user).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        boolean isPrime = true; // boolean is a data type in Java that can store only two values:true ✅ and
                                // false ❌ .

        // if (x <= 1) {
        // isPrime = false;
        // } else {
        // for (int i = 2; i < Math.sqrt(x); i++) { // math.sqrt(x) -> square root of x.
        // here we use i<x also .
        // if (x % i == 0) {
        // isPrime = false;
        // }

        // }
        // }
        // if (isPrime) {
        // System.out.println("Enter number is a prime number");
        // } else {
        // System.out.println("Enter number is not a prime number");

        // }
        for (int i = 2; i <= x / 2; i++) { // Math.sqrt(x) -> square root of x. here we use i<x also .
            if (x % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {

            if (x == 1) {
                System.out.println("This is neither prime not composite");
            } else {
                System.out.println("Enter number is a prime number");
            }
        } else {
            System.out.println("Enter number is not a prime number");
        }
        sc.close();
    }

}
