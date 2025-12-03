class thread_1 implements Runnable{
	public void run(){
	int i=0;
		while(i!=100){
			System.out.println("I am Happy.");
		i++;
		try{
			Thread.sleep(10);
		}
		catch(Exception e){}
		}
	}
}

class thread_2 implements Runnable{
	public void run(){
	int i=0;
		while(i!=100){
			System.out.println("Hey Good Morning.");
		i++;
		try{
			Thread.sleep(10);
		}
		catch(Exception e){}
		}
	}
}

public class J_33_multithread_runable_interface{
	public static void main(String args[]){
		thread_1 m1 = new thread_1();
		Thread th1 = new Thread(m1);
		th1.start();
		
		thread_2 m2 = new thread_2();
		Thread th2 = new Thread(m2);
		th2.start();
		
	}
}