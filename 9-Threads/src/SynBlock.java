
public class SynBlock implements Runnable {
	public StringBuffer sf;
	public void run(){
		synchronized(sf){
			// Each thread will execute this block completely before its exit
			for(int i=0;i<5;i++){
				System.out.println("THIs  IS " + Thread.currentThread().getName());
				System.out.println(sf);
				
				
			}
		}
	}
	SynBlock(StringBuffer s){
		sf=s;
	}
		
	public static void main(String[] args){
		StringBuffer s =new StringBuffer("a");
		SynBlock h=new SynBlock(s);
		Thread one=new Thread(h);
		Thread two=new Thread(h);
		Thread three=new Thread(h);
		one.setName("one");
		two.setName("two");
		three.setName("three");
		one.start();
		two.start();
		three.start();
		
	}
		
}
