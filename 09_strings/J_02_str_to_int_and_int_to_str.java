public class J_02_str_to_int_and_int_to_str
 {
    public static void main(String args[]) {
        // ParseInt Method of Integer class
        // This convert a String into a primitive int .

        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        // ToString Method of String class
        // This convert a int into a String .

        int number1 = 123;
        String str1 = Integer.toString(number1);
        System.out.println(str1);
        System.out.println(str1.length());
    }

}
