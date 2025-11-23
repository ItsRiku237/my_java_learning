import java.util.Scanner;

public class J_05_check_sorted_array {
    public static void main(String[] args) {
        // Q2  . Find the maximum & minimum number in an array of integers.
        // [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter Numbers:");

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("Largest number in the array is " + max);
        System.out.println("Smallest number in the array is " + min);

    }
}
