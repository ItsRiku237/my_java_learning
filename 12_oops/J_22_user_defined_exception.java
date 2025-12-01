import java.util.Scanner;

public class J_22_user_defined_exception {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            int x;
            System.out.print("Enter your age : ");
            x= sc.nextInt();
            if (x<0) {
                throw new ArithmeticException("Age can not be less than 0 .");
            }
            else if(18>= x && x>=0){
                System.out.println("Your are not eligible for vote.");
            }
            else{
                System.out.println("Your are eligible for vote.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Program Executed sucessfully");
        }
    }
}
