import java.util.Scanner;

public class J_04_max_min_array {

    // Homework Problems
    // Q1 . Take an array of names as input from the user and print them on the
    // screen.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of name :");
        int size = sc.nextInt();
        String[] name = new String[size];
        System.out.println("Enter names :");

        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }

        System.out.println("Enter names are :");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }

    }
}
