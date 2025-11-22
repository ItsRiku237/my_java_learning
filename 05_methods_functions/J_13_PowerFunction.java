import java.util.Scanner;

public class J_13_PowerFunction {
    // 5. Write a function that takes in age as input and returns if that person is
    // eligible to vote or not. A person of age > 18 is eligible to vote.
    public static boolean vote_eligiblity(int x) {
        boolean vote = false;
        if (x > 18) {
            vote = true;
        }
        return vote;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int x = sc.nextInt();

        if (vote_eligiblity(x)) {
            System.out.println("You are eligible for vote .");
        } else {
            System.out.println("You are not eligible for vote .");
        }

    }
}
