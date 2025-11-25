import java.util.Scanner;

public class J_04_replace_e_with_i
 {
    // Q7. Input a string from the user. Create a new string called ‘result’ in
    // which
    // you will replace the letter ‘e’ in the original string with letter ‘i’.
    // Example :
    // original = “eabcdef’ ; result = “iabcdif”
    // Original = “xyz” ; result = “xyz”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String original = sc.nextLine();
        String result = "";

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == 'e') {
                result += "i";
            } else {
                result += original.charAt(i);
            }
        }
        System.out.println("result = " + result);
    }
}
