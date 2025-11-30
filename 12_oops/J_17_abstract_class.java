abstract class shape{
    abstract double calculate_area();
}
class circle extends shape{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
    double calculate_area(){
        return Math.PI*radius*radius;
    }
}
class rectangle extends shape{
    double length;
    double breath;
    rectangle(int length , int breath){
        this.length = length;
        this.breath = breath;
    }
    double calculate_area(){
        return length*breath;
    }
}
public class J_17_abstract_class {
    public static void main(String args[]){
        shape circle = new circle(15.23);
        shape rectangle = new rectangle(4,6);
        System.out.println("Area of circle :"+circle.calculate_area());
        System.out.println("Area of rectangle :"+rectangle.calculate_area());
    }
}
