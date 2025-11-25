import java.util.Scanner;

public class J_04_replace_e_with_i
 {
    // Q10. Input a string from the user. Create a new string called ‘result’ in
    // which
    // you will replace the letter ‘e’ in the original string with letter ‘i’.
    // Example :
    // original = “eabcdef’ ; result = “iabcdif”
    // Original = “xyz” ; result = “xyz”
    // using StringBuilder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String original = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            if (original.charAt(i) == 'e') {
                result.append('i');
            } else {
                result.append(ch);
            }
        }

        System.out.println("result = " + result.toString());
    }
}
