

public class TestSynchronizedBlock implements Runnable {
    private int x;
    private int y;
    public static void main(String[] args) {
        TestSynchronizedBlock that=new TestSynchronizedBlock();
        (new Thread(that)).start();
        (new Thread(that)).start();
    }
    public void run(){
    	for(int i=0;i<10;i++){
    		synchronized(this){
    			x++;
    			y++;
    		}
    		System.out.println(Thread.currentThread().getName()+ "x="+x+"y="+y);
    	}
    }
}
