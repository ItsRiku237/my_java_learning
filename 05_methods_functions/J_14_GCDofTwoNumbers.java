import java.util.Scanner;

public class J_14_GCDofTwoNumbers {
    // 8. Two numbers are entered by the user, x and n. Write a function to find
    // the value of one number raised to the power of another i.e.power(x, n) .
    public static int power(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            // result = result * x;
            result *= x;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base (x) : ");
        int x = sc.nextInt();
        System.out.println("Enter exponent (n) : ");
        int n = sc.nextInt();

        System.out.println(x + " raised to the power " + n + " is : " + power(x, n));
        // double result= Math.pow(x, n); // it give double value but we can write int
        // value also
        // int result= (int)Math.pow(x, n); //we declear Math.pow like this .
        System.out.println("Power using built in method (Math.pow) is : " + Math.pow(x, n));

    }
}
