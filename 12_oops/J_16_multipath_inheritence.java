interface A {
    default void show(){
        System.out.println("From A");
    }
}
interface B extends A {
    default void show(){
        System.out.println("From B");
    }
}

interface C extends A{
    default void show(){
        System.out.println("From C");
    }
}
class D implements B,C{
    public void show(){
        System.out.println("D resolving conflict .");
        B.super.show();
        C.super.show();
        // A.super.show();//not allowed
    }
}

/*     A
      / \
     B   C
      \ /
       D
 */

public class J_16_multipath_inheritence {
    public static void main(String args[]){
        D obj = new D();
        obj.show();
        
    }
}
