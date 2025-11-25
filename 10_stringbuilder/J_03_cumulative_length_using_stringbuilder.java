import java.util.Scanner;

public class J_03_cumulative_length_using_stringbuilder
 {
    // Q9. Take an array of Strings input from the user & find the cumulative
    // (combined) length of all those strings.
    // using StringBuilder
    public static void main(String[] args) {
        // Here is one problem tht it take size-1 input in array .

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of String is :");
        int size = sc.nextInt();
        sc.nextLine();

        String arr[] = new String[size];
        StringBuilder combined = new StringBuilder();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter" + (i + 1) + "String .");
            arr[i] = sc.nextLine();
            combined.append(arr[i]);
        }
        System.out.println("Comulative length :" + combined.length());

    }
}
