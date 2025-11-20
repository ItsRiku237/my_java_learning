import java.util.Scanner;

public class J_02_SumOfTwoNumbers {
    // FUNCTOION

    // syntax of function :
    // return-type function_name (parameter 1, parameter2, …… parameter
    // n){//function_body }

    public static void printMyName(String name) {
        System.out.println(name);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.next();

        printMyName(name); // call to function

    }
}
