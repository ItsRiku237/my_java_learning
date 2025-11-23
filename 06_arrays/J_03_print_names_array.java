import java.util.Scanner;

public class J_03_print_names_array {

    // Q.Take an array as input from the user. Search for a given number x and print
    // the index at which it occur.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array :");
        int n = sc.nextInt();
        int numbers[] = new int[n];

        // input
        System.out.println("Enter number as input :");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        // output

        System.out.println("Enter number which finding index :");
        int numberIndex = sc.nextInt();

        System.out.println("Number found at index :");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberIndex) {
                System.out.println(i);
            }

        }
        sc.close();
    }

}
