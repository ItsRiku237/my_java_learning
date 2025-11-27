import Bank.Bank;
//Package in Java 

public class J_04_Packages {
    public static void main(String[] args) {
        Bank.Account Account1 = new Bank.Account();
        Account1.Name = "Customer1";
        System.out.println("Account Holder :" + Account1.Name);

    }
}
