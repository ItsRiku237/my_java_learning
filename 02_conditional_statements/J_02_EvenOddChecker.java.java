import java.util.*;

public class J_8th_program {
    // '%'-->modulo { it help to find reminder of any number w.r.t another number
    // eg. 8%2 is 0 .}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Enter number is Even .");
        } else {
            System.out.println("Enter number is Odd .");

        }
    }
}
