//Inheritance

class Shape {
    public void Area() {
        System.out.println("Display Area of shape");
    }
}

// Single inheritance
class Triangle extends Shape {
    public void Area(int h, int b) {
        System.out.println("Area of Triangle is " + (0.5) * b * h);
    }
}

// Multilevel inheritance
class EquileteralTriangle extends Triangle {
    public void Area(int h, int b) {
        System.out.println("Area of Triangle is " + (0.5) * b * h);
    }
}

// Hierarchical inheritance
class Circle extends Shape {
    public void Area(int r) {
        System.out.println("Area of Circle is " + 3.14 * r * r);
    }
}

// Hybrid inheritance -->combination of simple, multiple inheritance and
// hierarchical inheritance.

public class J_03_Inheritance {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.Area();

        Triangle t1 = new Triangle();
        t1.Area(2, 4);

        EquileteralTriangle e1 = new EquileteralTriangle();
        e1.Area(2, 6);

        Circle c1 = new Circle();
        c1.Area(7);

    }
}
