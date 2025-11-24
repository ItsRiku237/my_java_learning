import java.util.Scanner;

public class J_03_total_length_of_str_arr
 {
    // Q6. Take an array of Strings input from the user & find the cumulative
    // (combined) length of all those strings.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array is :");
        int size = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter String as input :");
        String arr[] = new String[size];
        int totLength = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
            totLength += arr[i].length();
        }
        System.out.println("Total length of all those string are " + totLength);

    }
}
