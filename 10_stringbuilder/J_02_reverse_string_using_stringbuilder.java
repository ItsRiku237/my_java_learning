public class J_02_reverse_string_using_stringbuilder
 {
    // Q. Reverse a string.

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Riku Sahu");
        for (int i = 0; i < sb.length() / 2; i++) {
            int Front = i;
            int Back = sb.length() - 1 - i;

            char Frontchar = sb.charAt(Front);
            char Backchar = sb.charAt(Back);

            sb.setCharAt(Back, Frontchar);
            sb.setCharAt(Front, Backchar);
        }
        System.out.println(sb);
    }
}
