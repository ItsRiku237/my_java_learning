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
class Cat extends Dog{
    void show_c(){
        System.out.println("cat are also cutie.");
    }
}
public class J_12_multilevel_inheritence {
    public static void main(String args[]){
        Cat c = new Cat();
        c.show_A();
        c.show_B();
        c.show_c();
    }
}
