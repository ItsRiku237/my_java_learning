import java.util.Scanner;

public class J_05_extract_username_from_email
 {

    // Q8. Input an email from the user. You have to create a username from the
    // email
    // by deleting the part that comes after ‘@’. Display that username to the user.
    // Example :
    // email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
    // email = “helloWorld123@gmail.com”; username = “helloWorld123”
    // using StringBuilder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a email :");
        String email = sc.nextLine();

        StringBuilder userName = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName.append(ch);
            }
        }
        System.out.println("User Name of this email is " + userName.toString());
    }
}
