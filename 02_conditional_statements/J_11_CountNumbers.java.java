import java.util.Scanner;

public class J_53th_program {
    // 7. Write a program to enter the numbers till the user wants and at the end it
    // should display the count of positive, negative and zeros entered.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zeros = 0;
        int input = 1;
        while (input == 1) {
            System.out.println("Enter your number :");
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Enter '1' to continue and '0' to stop : ");
            input = sc.nextInt();

        }

        System.out.println("Total Entered Positive number is " + positive);
        System.out.println("Total Entered Negative number is " + negative);
        System.out.println("Total Entered Zero is " + zeros);
    }
}
