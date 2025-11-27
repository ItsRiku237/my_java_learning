//Polymorphism

//1. Compile Time Polymorphism (Static) 
class Student {
    String Name;
    int age;

    public void displayInfo(String Name) {
        System.out.println(Name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String Name, int age) {
        System.out.println(Name + " " + age);
    }
}

// 2. Runtime Polymorphism (Dynamic)
class Shape {
    public void area() {
        System.out.println("Displya area of shape.");
    }
}

class Triangl extends Shape {
    public void area(int b, int h) {
        System.out.println("Area of Triangle is " + (0.5) * b * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println("Area of Circle is " + 3.14 * r * r);
    }
}

public class J_02_Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Name = "Ayush";
        s1.age = 19;

        s1.displayInfo(s1.Name);
        s1.displayInfo(s1.age);
        s1.displayInfo(s1.Name, s1.age);

        Shape sh1 = new Shape();
        sh1.area();

        Triangl t1 = new Triangl();
        t1.area(6, 6);

        Circle c1 = new Circle();
        c1.area(7);

    }
}
