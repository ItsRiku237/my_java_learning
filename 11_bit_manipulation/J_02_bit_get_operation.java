public class J_02_bit_get_operation
 {
    // Bit Manupulation ==> Get , Set , Clear , Update
    // Q. Get the 3rd bit(2nd position)of a number n.(n = 0101)

    public static void main(String[] args) {
        // ANS: 1. Bit Mask: 1<<i
        // 2. Operation : AND
        int n = 5;// 0101
        int pos = 2;
        int bitMask = 1 << pos;// 0100

        if ((bitMask & n) == 0) {// 0100 & 0101 = 0100
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }

    }
}
