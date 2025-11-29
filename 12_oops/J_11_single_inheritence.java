''' Java officially supports only 3 types of inheritance:
✔ Single
✔ Multilevel
✔ Hierarchical

❌ Java does NOT support:
✘ Multiple
✘ Hybrid
✘ Multipath inheritance (because of the diamond problem)

BUT using Interfaces, we can simulate multiple, hybrid & multipath inheritance.'''

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
public class J_11_single_inheritence {
    public static void main(String args[]){
        Dog d = new Dog();
        d.show_A();
        d.show_B();
    }
}
