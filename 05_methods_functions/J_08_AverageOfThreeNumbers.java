import java.util.Scanner;

public class J_08_AverageOfThreeNumbers {
    // Make a function to print the table of a given number n.
    public static void printTable(int a) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int n = sc.nextInt();
        printTable(n);
    }

}
