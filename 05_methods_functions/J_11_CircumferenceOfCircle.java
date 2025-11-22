import java.util.Scanner;

public class J_11_CircumferenceOfCircle {
    // 3. Write a function which takes in 2 numbers and returns the greater of those
    // two.

    public static int greaterNo(int x1, int x2) {
        int greater;
        if (x1 > x2) {
            greater = x1;
        } else {
            greater = x2;
        }
        return greater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();

        // greaterNo(x1, x2);
        System.out.println("Greater number is :" + greaterNo(x1, x2));

    }
}
