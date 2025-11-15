import java.util.Scanner;

public class J_16th_program {
    // Homework Problems

    // Q1(switch case). Make a Calculator. Take 2 numbers (a & b) from the user and
    // an operation
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

        switch (Button) {
            case 1:
                System.out.println("Result : " + (a + b)); // Effective way to do
                break;
            case 2:
                System.out.println("Result : " + (a - b));
                break;
            case 3:
                System.out.println("Result : " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid division");
                } else {
                    double div = (double) a / b;// double/float are not show point value only show __.0
                    System.out.println(div);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid modulo operator");
                } else {
                    int mod = a % b;
                    System.out.println(mod);
                }
                break;
            default:
                System.out.println("Invalid Button");
                break;
        }
        sc.close();
    }

}
