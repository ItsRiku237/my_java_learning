import java.util.Scanner;

public class J_12_VotingEligibility {
    // 4. Write a function that takes in the radius as input and returns the
    // circumference of a circle.

    public static double circumference(int R) {
        double circu;
        circu = 2 * R * (3.14);

        return circu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the redius of circle : ");
        int r = sc.nextInt();

        System.out.println("Greater number is :" + circumference(r));

    }
}
