
public class ThreadDemo  implements Runnable{
 	private int count;  
 	public void run(){
    	dosomething();
    }
    public synchronized void dosomething(){
    	for(int i=0;i<5;i++){
    		System.out.println(Thread.currentThread().getName()+count++);
    		
    	}
    }
    public static void main(String[] args) {
    	Runnable r=new ThreadDemo();
    	Runnable s=new ThreadDemo();
    	new Thread(r).start();
    		new Thread(s).start();
       
    }
}
