

public class StaticBlockInit {
    
    public static void main(String[] args) {
        new Dog().done();
    }
}
class Animal{
	static {System.out.println("Inside animal static");}
	static int x=7;
}
class Dog extends Animal{
	static {System.out.println("Inside dog static");
	}
	public  void done(){
		System.out.println("Inside non-static method "+x);	
		
	}
}
