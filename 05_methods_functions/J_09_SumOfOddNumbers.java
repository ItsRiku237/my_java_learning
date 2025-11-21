import java.util.*;

public class J_09_SumOfOddNumbers {
    // Exercise 1

    // Q1 .Enter 3 numbers from the user & make a function to print their average.
    public static void avg(float x1, float x2, float x3) {
        float avg = (x1 + x2 + x3) / 3;
        System.out.println("Average of 3 number is " + avg);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number to find average:");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();// we can use double here also .
        avg(n1, n2, n3);

    }

}
