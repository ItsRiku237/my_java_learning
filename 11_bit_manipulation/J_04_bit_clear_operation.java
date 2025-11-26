public class J_04_bit_clear_operation
 {
    // Bit Manupulation ==> Get , Set , Clear , Update
    // Q. Clear the 3rd bit(2nd position)of a number n.(n = 0101) -> (5)10

    public static void main(String[] args) {
        // ANS: 1. Bit Mask: 1<<i
        // 2. Operation : AND with NOT of Bit Mask
        int n = 5;// 0101
        int pos = 2;
        int bitMask = 1 << pos; // 0100
        int notBitMask = ~bitMask; // 1011

        int newNumber = notBitMask & n;// 1011 & 0101 = 0001 ==> (1)10
        System.out.println(newNumber);
    }
}
