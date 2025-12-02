class Medical extends Thread{
	public void run(){
		System.out.println("Medical checkup started.");
		try{
			Thread.sleep(1000);
			System.out.println("Medical checkup ended.");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class TestDrive extends Thread{
	public void run(){
		System.out.println("Medical lab test started.");
		try{
			System.out.println("Medical lab test ended.");
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

class Officer extends Thread{
	public void run(){
		System.out.println("Medicine verification started.");
		try{
			System.out.println("Medicine verification ended.");
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

public class J_31_join_method{
	public static void main(String args[])throws Exception{
		Medical c = new Medical();
		TestDrive t = new TestDrive();
		Officer o = new Officer();
		
		c.start();
		c.join();
		
		t.start();
		t.join();
		
		o.start();
		o.join();
		
		System.out.println("Hospital work is completed successfully.");
	}
}