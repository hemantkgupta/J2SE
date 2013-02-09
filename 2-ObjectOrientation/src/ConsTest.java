public class ConsTest {
    public static void main(String[] args) {
    	BBB b=new BBB();
    	System.out.println("starting...");
        b.aMethod();
    }
}

abstract class AAA{
	public AAA(){
		System.out.println("Abstract class constructor executed");
		
	}
	public abstract void aMethod();
}

class BBB extends AAA{
	private String name;
	private int value;
	public BBB(){
		this("Hemant",1);
		System.out.println("Sub class constructor executed");
	}
	public BBB(String n,int v){
		System.out.println("Sub class overloaded constructor executed");
		name=n;
		value=v;
	}
	public void aMethod(){
		System.out.println("Sub class method executed");
	}
}