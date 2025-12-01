class Animal{
    String colour;
    int age;
    String bred;
    int height;
    int weight;

    void display() {
        System.out.println("colour : " + colour);
        System.out.println("age : " + age);
        System.out.println("bred : " + bred);
        System.out.println("height : " + height);
        System.out.println("weight : " + weight);
    }
}

public class J_23_attributes {
    public static void main(String[] args){
        Animal a = new Animal();
        a.colour = "Red";
        a.age = 19;
        a.bred = "a";
        a.height = 45;
        a.weight = 34;
        a.display();
    }
}