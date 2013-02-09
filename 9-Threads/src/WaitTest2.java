public class WaitTest2 {    
    public static void main(String[] args) {
    	B bbb=new B();
    	
        Thread one=new Reader1(bbb);
        Thread two=new Writer1(bbb);
        one.start();
        two.start();
        }
}

class Reader1 extends Thread{
	B b;
	Reader1(B bb){b=bb;	}
	public void run(){
		for(int j=0;j<10;j++)
			b.read();	
	}
}
class Writer1 extends Thread{
	B b;
	Writer1(B bb){b=bb;	}
	public void run(){
		for(int j=0;j<10;j++)
			b.write();
	}
}					
class B {	
int i;
boolean av=false;
	public synchronized void read(){
		System.out.println(Thread.currentThread().getName() + "read");
		while(av==false){
		
		try{
			System.out.println("Inside read waiting started... ");
		    wait();
		}catch(InterruptedException e){	System.out.println("Some Thing in read wrong");	}
		}
		av=false;
		
		System.out.println("Read  i is :"+i);
		notifyAll(); 
		
	}
	public synchronized void write(){
		
		System.out.println(Thread.currentThread().getName() + "write");
		while(av==true){
		
		try{
			System.out.println("inside write waiting started...");
		    wait();
		}catch(InterruptedException e){	System.out.println("Some Thing in write wrong");}
		}
		i=i+2;
		av=true;
		System.out.println("Write  i is :"+i);
		notifyAll(); 
		
	}
}