import java.util.*;

public class J_10th_program {
    // Q. Print the gretting
    // 1--> Hello
    // 2--> Namaste
    // 3--> Bonjour

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int Button = sc.nextInt();

        // if (Button == 1) {
        // System.out.println("Hello");
        // } else if (Button == 2) {
        // System.out.println("Namaste");
        // } else if (Button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid Button");
        // }

        switch (Button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }

    }
}
