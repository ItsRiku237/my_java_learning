interface I1{
    public abstract void show();
}

interface I2{
    void display();
}

class Test implements I1,I2{
    public void show(){
        System.out.println("Show method.");
    }
    public void display(){
        System.out.println("Show display");
    }
}
public class J_20_interface{
    public static void main(String args[]){
        Test t = new Test();
        t.show();
        t.display();
    }
}