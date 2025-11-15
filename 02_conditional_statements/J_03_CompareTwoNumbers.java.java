import java.util.*;

public class J_9th_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("Enter value of a and b is Equal");
        // } else {
        // if (a > b) {
        // System.out.println("Value of a is greater than b .");
        // } else {
        // System.out.println("Value of a is smaller than b .");
        // }
        // }
        if (a == b) {
            System.out.println("Enter value of a and b is Equal");
        } else if (a > b) {
            System.out.println("Value of a is greater than b .");
        } else {
            System.out.println("Value of a is smaller than b .");
        }

    }
}
