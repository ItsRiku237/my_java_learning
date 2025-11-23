import java.util.Scanner;

public class J_02_search_number_in_array {

    // ARRAY
    // SYNTEX:
    // type[] arrayName =new type[size];
    // type arrayName[] =new type[size];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // output

        // int mark[] = new int[3];
        // int[] mark = new int[3];
        int mark[] = { 98, 99, 97 }; // all the method give same output.
        // mark[0] = 98;
        // mark[1] = 99;
        // mark[2] = 97;

        // System.out.println(mark[0]);
        // System.out.println(mark[1]);
        // System.out.println(mark[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(mark[i]);

        }
    }

}
