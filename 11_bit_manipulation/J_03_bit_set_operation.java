public class J_03_bit_set_operation
 {
    // Bit Manupulation ==> Get , Set , Clear , Update
    // Q. Set the 2nd bit(1st position)of a number n.(n = 0101) -> (5)10

    public static void main(String[] args) {
        // ANS: 1. Bit Mask: 1<<i
        // 2. Operation : OR
        int n = 5;// 0101
        int pos = 1;
        int bitMask = 1 << pos;// 0010

        int newNumber = bitMask | n;// 0010 | 0101 = 0111 ==> (7)10
        System.out.println(newNumber);
        
    }
}
