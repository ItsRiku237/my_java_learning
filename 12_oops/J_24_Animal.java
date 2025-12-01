public class J_24_Animal{
	public void run(){
	System.out.println("Animal are Runing.");
	}
	public void eat(){
	System.out.println("Animal are Eating.");
	}
	public void bark(){
	System.out.println("Animal are Barking.");
	}
	public static void main(String[] args){
	J_24_Animal obj = new J_24_Animal();
	obj.run();
	obj.eat();
	obj.bark();
	System.out.println("");
	Bird bi = new Bird();
	bi.fly();
	bi.eat();
	bi.sleep();
	}
	
}
class Bird{
	public void fly(){
	System.out.println("Bird are flying.");
	}
	public void eat(){
	System.out.println("Bird are Eating.");
	}
	public void sleep(){
	System.out.println("Bird are Sleeping.");
	}
	
}