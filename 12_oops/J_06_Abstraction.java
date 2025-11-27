//Abstraction

//1. Abstract class
abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal.");
    }

    public void eat() {
        System.out.println("Animal eat");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Created a Horse");
    }

    public void walk() {
        System.out.println("Walk on 4 legs.");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walk on 2 legs.");
    }
}

// 2. Interfaces
interface Human {
    int eye = 2;

    void walk();// without public it also work.
}

interface Animelia {

}

class Boys implements Human, Animelia {
    public void walk() {
        System.out.println("walks on 2 legs.");
    }
}

public class J_06_Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        // Animal a1= new Animal(); //compile time error bcz Animal class is abstract.
        // a1.walk();

        Boys b1 = new Boys();
        b1.walk();
        System.out.println("Boys are " + b1.eye + " eye.");
    }
}
