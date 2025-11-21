import java.util.Scanner;

public class J_07_PrintTable {
    // Make a function to check if a given number n is even or not.
    public static void checkEvenOrOdd(int a) {

        if (a % 2 == 0) {
            System.out.println(a + " is a EVEN Number .");
            return;
        }
        System.out.println(a + " is a ODD Number .");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int n = sc.nextInt();
        checkEvenOrOdd(n);

    }

}
