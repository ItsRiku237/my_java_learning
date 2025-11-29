
interface Dog{
    void show_A();
}
interface Cat{
    void show_B();
}

class Animal implements Dog , Cat{
    public void show_A(){
        System.out.println("Dog are cutie.");
    }
    public void show_B(){
        System.out.println("cat are also cutie.");
    }
    void show_C(){
        System.out.println("Animal are very inteligent");
    }
}


public class J_14_multiple_inheritence {
    public static void main(String args[]){
        Animal a = new Animal();
        a.show_A();
        a.show_B();
        a.show_C();
        
    }
    
}
