public class J_21_exception_handling {
    public static void main(String args[]){
        int a = 10 ,b = 0,c;
        try{
            c= a/b;
            System.out.println("C = "+c);
        }
        catch(ArithmeticException e){
            System.out.println("A number can not be devided by zero.");
        }
        finally{
            System.out.println("Execution completed.");
        }
    }
}
