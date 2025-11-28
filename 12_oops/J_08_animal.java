import java.util.*;

// WAP in java to create an animal class with its methods run
// eat, bark and then access the method using an object of this class.

public class J_08_animal {

    public void run(){
        System.out.println("Animal are run.");
    }
    public void eat(){
        System.out.println("Animal are eat");
    }
    public void bark(){
        System.out.println("Animal are bark");
    }
    public static void main(String args[]){
        J_08_animal obj = new J_08_animal();
        obj.run();
        obj.eat();
        obj.bark();
    }
}
