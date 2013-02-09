

public class YieldTest {
    
    public static void main(String[] args) {
    	Runnable r=new myRunnable();
        Thread one=new Thread(r,"one");
        one.setPriority(6);
        
        Thread two=new Thread(r,"two");
        two.setPriority(6);
        
        Thread three=new Thread(r,"three");
        three.setPriority(6);
        one.start();
        two.start();
        Thread.yield();
        three.start();
    }
}

class myRunnable implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	//	Thread.yield();
	//	System.out.println("after"+Thread.currentThread().getName());
	}
		
}