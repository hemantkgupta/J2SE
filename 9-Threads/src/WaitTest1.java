public class WaitTest1 {    
    public static void main(String[] args) {
    	B bbb=new B();
    	Runnable r=new A(bbb);
    	Runnable r=new C(bbb);
        Thread one=new Thread(r,"one");
        Thread two=new Thread(r,"two");
        one.start();
        two.start();
        }
}

class A implements Runnable {	

	B b;
	A(B bb){b=bb;}
	public void run(){		
		b.doNothing();
	}
}
class C implements Runnable {	

	B b;
	A(B bb){b=bb;}
	public void run(){		
		b.nothing();
	}
}				
class B {	
int i;
	public synchronized void doNothing(){
		System.out.println(Thread.currentThread().getName() + ": doNothing");
		try{
			System.out.println("Here i is :"+i);
		    wait();
		}catch(InterruptedException e){	System.out.println("Some Thing wrong");	}
		i++;
		System.out.println("Now  i is :"+i);
		notify(); 
		
	}
	public synchronized void nothing(){
		System.out.println(Thread.currentThread().getName() + ": nothing");
		try{
			System.out.println("Here i is in doNothig :"+i);
		    wait();
		}catch(InterruptedException e){	System.out.println("Some Thing in nothing wrong");	}
		i++;
		System.out.println("Now  i is in nothing :"+i);
		notify(); 
		
	}
}