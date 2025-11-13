import java.util.*;

public class J_05_InputScanner_Advanced {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("The addition of a + b  =");
        int add = a + b;
        System.out.println(add);
        int sub = a - b;
        System.out.println("The Subtraction of a + b  =");
        System.out.println(sub);
    }
}
