
public class D extends Thread{
    public D(String s){
    	super (s);
    }
    public void run(){
    	for(int  i=0;i<10;i++){
    	
    	System.out.println(i+" "+getName());
    	try{
    		sleep(1000);
    	}catch(Exception e){
    	}
    	System.out.println("Done "+getName());
    	}
    }
    public static void main(String[] args) {
    	new D("Hi").start();
        	new D("Hi").start();
        
    }
}
