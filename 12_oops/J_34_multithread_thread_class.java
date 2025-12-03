class multithread_1 extends Thread{
	public void run(){
	int i;
		/*while(i!=200){
			System.out.println("I am Happy.");
		i++;
		}*/
		for(i=0;i<200;i++){
			System.out.println("I am Happy.");
			try{
				Thread.sleep(10);
			}catch(Exception e){}
		}
	}
}

class multithread_2 extends Thread{
	public void run(){
	int i;
		/*while(i!=200){
			System.out.println("I am sad.");
		i++;
		}*/
		for(i=0;i<200;i++){
			System.out.println("I am sad.");
			try{
				Thread.sleep(10);
			}catch(Exception e){}
		}
	}
}

public class J_34_multithread_thread_class{
	public static void main(String args[]){
		multithread_1 m1 = new multithread_1();
		multithread_2 m2 = new multithread_2();
		m1.start();
		m2.start();
	}
}