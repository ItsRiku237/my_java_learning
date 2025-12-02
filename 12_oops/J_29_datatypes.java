import java.io.*;

public class J_29_datatypes {
   public static void main(String[] args) {
      // printing datatypes;
      System.out.println(" DATATYPES ");
      // primitive type;
      // Integer types;
      byte B = 100;
      short s = 10000;
      int i = 50000;
      long l = 1000000000L;
      // Floating point types;
      float f = 5.75f;
      double d = 19.99;
      // Character type
      char c = 'A';
      // Boolean type
      boolean n = true;
      // non primitive type;
      // String type;
      String S = "Hello java";

      System.out.println(" VARIABLE");

      byte byteVar = 100;
      short shortVar = 10000;
      int intVar = 50000;
      long longVar = 1000000000L;
      float floatVar = 5.75f;
      double doubleVar = 19.99;
      char charVar = 'A';
      boolean booleanVar = true;
      String StringVar = "Hello java";

      System.out.println("Byte value: " + byteVar);
      System.out.println("Short value: " + shortVar);
      System.out.println("Int value: " + intVar);
      System.out.println("Long value: " + longVar);
      System.out.println("Float value: " + floatVar);
      System.out.println("Double value: " + doubleVar);
      System.out.println("Char value: " + charVar);
      System.out.println("Boolean value: " + booleanVar);
      System.out.println("String value: " + StringVar);
      System.out.println("    Operators   ");
      int a = 10, b = 4;
      System.out.println("\nArithmetic Operators:");
      System.out.println("a+b =" + (a + b));
      System.out.println("a-b =" + (a - b));
      System.out.println("a*b =" + (a * b));
      System.out.println("a/b =" + (a / b));
      System.out.println("a%b =" + (a % b));
      System.out.println("\nRelational Operators:");
      System.out.println("a<b:" + (a < b));
      System.out.println("a>b:" + (a > b));
      System.out.println("a==b:" + (a == b));
      System.out.println("a!=b:" + (a != b));
      boolean x = true, y = false;
      System.out.println("\nLogical Operators:");
      System.out.println("x&&y:" + (x && y));
      System.out.println("x||y:" + (x || y));
      System.out.println("!x:" + (!x));
      int num = 5;
      int counter = 5;
      System.out.println("\nAssignment Operator:");
      System.out.println("Initial num : " + num);
      System.out.println("\nIncreament,Decrement");
      System.out.println("counter: " + counter);
      System.out.println("counter ++ : " + (counter++));
      // System.out.println(" After counter ++:" + (After counter));
      System.out.println("++counter : " + (++counter));
      // System.out.println("After ++ counter:" + (After ++ counter));

   }
}