import java.io.*;

class Vehicle{
	void run(){
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle{
	
	void run(){
		System.out.println("Car is running");
	}
	
}

class J_32_method_Overloading{
	public static void main(String[] args){
		Vehicle v=new Vehicle();
		Car c=new Car();
		v.run();
		c.run();
	}
}