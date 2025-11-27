//Access Modifiers in Java 

import Bank.Bank;

class Shape {
    String Colour;// 1. Default: The access level of a default modifier is only within the
                  // package.

    // 2. Protected: The access level of a protected modifier is within the package
    // and
    // outside the package through child class. If you do not make the child
    // class,it cannot be accessed from outside the package.
    protected int area;

    // 3. Private: The access level of a private modifier is only within the class.
    // It
    // cannot be accessed from outside the class.
    private String password;

    // we are acces private variable using getters & Setters function.
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

}

public class J_05_Access_Modifiers {
    public static void main(String[] args) {
        Bank.Account Account1 = new Bank.Account();
        Account1.Name = "Customer1";// 4. Public: The access level of a public modifier is everywhere.
        System.out.println("Account Holder : " + Account1.Name);

        Shape s1 = new Shape();
        s1.Colour = "Red";// Default access

        s1.area = 24;// protected access

        // s1.password = "Riku";//we are not accesed bcz of private variable.
        s1.setPassword("Riku");
        System.out.println("Password is " + s1.getPassword());
    }
}
