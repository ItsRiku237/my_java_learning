import java.util.Scanner;

public class J_11th_program {
    // Homework Problems

    // Q1.(If-else) Make a Calculator. Take 2 numbers (a & b) from the user and an operation
    // as follows :
    // 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the
    // user.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();

        System.out.println("Enter the number for :");
        System.out.println(
                "1-(Addition) a + b \n2-(Subtraction) a - b\n3-(Multiplication) a * b \n4-(Division) a/b\n5-(Modulo or remainder) a % b");
        int Button = sc.nextInt();
        // int add = a + b;
        // int sub = a - b;
        int mul = a * b;
        // int mod = a % b; // when this line is put here and put b = 0 then code shoe
        // error bcz the division has already occurred and division '0' is not allowed
        // in java.

        if (Button == 1) {
            System.out.println("Result : " + (a + b)); // Effective way to do
        } else if (Button == 2) {
            System.out.println("Result : " + (a - b));
        } else if (Button == 3) {
            System.out.println(mul);
        } else if (Button == 4) {
            if (b == 0) {
                System.out.println("Invalid division");
            } else {
                double div = (double) a / b;// double/float are not show point value only show __.0
                System.out.println(div);
            }

        } else if (Button == 5) {
            if (b == 0) {
                System.out.println("Invalid modulo operator");
            } else {
                 int mod = a % b;
                System.out.println(mod);
            }

        } else {
            System.out.println("Invalid Button");
        }
        sc.close();

    }
}
