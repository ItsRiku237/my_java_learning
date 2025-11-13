import java.util.*;

public class J_04_InputScanner_Basic {
        public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);

        sc.nextLine();//It is used when upper line was not content sc.nextLine() to execute next line.
        String name1 = sc.nextLine();
        System.out.println(name1);   

        int a = sc.nextInt();
        System.out.println(a);

        float b = sc.nextFloat();
        System.out.println(b);
        // sc.close();
    }
}
