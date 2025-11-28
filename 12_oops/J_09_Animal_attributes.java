// WAP in Java to create an
// animal class with its attributes colour, weight,
//  height, age and access the attributes using an Object of the class.

public class J_09_Animal_attributes {
    String colour;
    int weight;
    int height;
    int age;

    void details(String animal_colour ,int animal_weight , int animal_height , int animal_age){
        colour = animal_colour;
        weight = animal_weight;
        height = animal_height;
        age = animal_age;
    }
    void display(){
        System.out.println("Colour of the animal : "+ colour);
        System.out.println("Weight of the animal : "+ weight);
        System.out.println("Height of the animal : "+ height);
        System.out.println("Age of the animal : "+ age);
    }
    
    public static void main(String args[]){
        J_09_Animal_attributes obj = new J_09_Animal_attributes();
        obj.details("Red",77,5,66);
        obj.display();
        obj.details("Yellow",31,9,08);
        obj.display();
    }
}
