import java.util.Scanner;

public class J_05_bit_update_operation
 {
    // Bit Manupulation ==> Get , Set , Clear , Update
    // Q. Update the 2nd bit(1st position)of a number n to 1.(n = 0101) -> (5)10

    public static void main(String[] args) {
        // ANS: case 1 (for 0) ==> Clear Operation
        // 2. case 2 (for 1) ==> Set Operation
        Scanner sc = new Scanner(System.in);

        int n = 5;// 0101
        int pos = 1;
        System.out.println("Enter Update number 0 or 1 :");
        int oper = sc.nextInt();

        int bitMask = 1 << pos; // 0010
        if (oper == 1) {
            int newNumber = bitMask | n;// 0010 | 0101 = 0111 ==> (7)10
            // Set
            System.out.println(newNumber);
        } else {
            // Clear
            int notBitMask = ~bitMask; // 1101
            int newNumber = notBitMask & n;// 1101 & 0101 = 0101 ==> (5)10
            System.out.println(newNumber);
        }

    }
}
