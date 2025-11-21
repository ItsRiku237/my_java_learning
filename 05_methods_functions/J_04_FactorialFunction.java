import java.util.Scanner;

public class J_04_FactorialFunction {

    public static int calculateMul(int a, int b) {
        return  a * b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();
        System.out.println("Multiplication of 2 number is :" +calculateMul(a, b));

    }
}
