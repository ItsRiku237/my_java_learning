import java.util.Scanner;

public class J_28th_program {
    // Q2 . Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
    // If the user enters 1 then keep taking input from the user for a student’s
    // marks(out of 100).
    // If they enter 0 then stop.
    // If he/ she scores :
    // Marks >=90 -> print “This is Good”
    // 89 >= Marks >= 60 -> print “This is also Good”
    // 59 >= Marks >= 0 -> print “This is Good as well”
    // Because marks don’t matter but our effort does.
    // (Hint : use do-while loop but think & understand why)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("Enter number 1 to 'continue' and 0 to stop ");
            input = sc.nextInt();

            if (input == 1) {
                System.out.println("Enter your mark between 1 to 100 .");
                int mark = sc.nextInt();
                if (mark >= 90 && mark <= 100) {
                    System.out.println("This is Good");
                } else if (mark >= 60 && mark <= 89) {
                    System.out.println("This is also Good");
                } else if (mark >= 0 && mark <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Please enter valid mark between 1 to 100 .");
                }
            } else if (input != 0) {
                System.out.println("Invalid input! Enter '1' and '0' ");
            }

        } while (input != 0);

        System.out.println("Program ended");
        sc.close();
        // This program is stop when you put input = 0 when u put input = 1 u put mark
        // then repeat that process.
    }

}
