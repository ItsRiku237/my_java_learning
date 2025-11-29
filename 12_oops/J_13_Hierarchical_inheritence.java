class Animal{
    void show_A(){
        System.out.println("Animal are very inteligent");
    }
}
class Dog extends Animal{
    void show_B(){
        System.out.println("Dog are cutie.");
    }
}
class Cat extends Animal{
    void show_c(){
        System.out.println("cat are also cutie.");
    }
}
public class J_13_Hierarchical_inheritence {
    public static void main(String args[]){
        Dog d = new Dog();
        d.show_A();
        d.show_B();
        
        Cat c = new Cat();
        c.show_A();
        c.show_c();
        
    }
}
