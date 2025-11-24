import java.util.Scanner;

public class J_02_2d_array_search_element
 {
    // 2D ARRAY
    // SYNTEX:
    // type[][] arrayName =new type[row][columns];
    // type arrayName[][] =new type[row][columns];

    // row -> horizental(We take 1st loop generally initilise with 'i')
    // columns -> verticasl(We take 2nd loop generally initilise with 'j')

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows :");
        int row = sc.nextInt();
        System.out.println("Enter number of columns :");
        int cols = sc.nextInt();

        int numbers[][] = new int[row][cols];
        System.out.println("Enter element of the array :");

        // input
        // row
        for (int i = 0; i < row; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Arrays elements are :");

        // output
        // row
        for (int i = 0; i < row; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
