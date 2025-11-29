/*Java does NOT support hybrid inheritance using classes
    Because hybrid = combination of two or more types (like multilevel + multiple), 
    and Java does not allow multiple inheritance with classes.But…
    ✅ Java supports Hybrid Inheritance using Interfaces
    ⭐ Hybrid Inheritance = Multilevel + Hierarchical + Multiple combined*/



interface A {
    void show_A();
}
class B implements A {
    public void show_A(){
        System.out.println("From Interface A");
    }
    public void show_B(){
        System.out.println("Class B");
    }
}

class C extends B{
    public void show_C(){
        System.out.println("Class C");
    }
}
class D extends B{
    public void show_D(){
        System.out.println("Class D");
    }
}

/*    Interface A
        |
     Class B
      /   \
 Class C   Class D
 */

public class J_15_hybrid_inheritence{
    public static void main(String args[]){
        C obj1 = new C();
        obj1.show_A();
        obj1.show_B();
        obj1.show_C();

        D obj2 = new D();
        obj2.show_A();
        obj2.show_B();
        obj2.show_D();
    }
}