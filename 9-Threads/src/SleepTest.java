
public class SleepTest implements Runnable{
	public void run(){
		int count=1;
		for(int i=0;i<100;i++){
			System.out.println("count is"+ count);
			if(count%10==0)System.out.println("After 10 iterations");
			count++;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){}
		}
	}
	public static void main(String[] args){
		Runnable r=new SleepTest();
		Thread t=new Thread(r);
		t.start();
	}
}
