public class TestRegularInnerClass {
	public static void main(String[] args) {
       new Outer().new Inner().go();
       new Outer().start();
    }


}
class Outer{
	private int x=2;
    class Inner {
    	private int x=1;
    	public void go(){
    		System.out.println("Inner class x is: "+this.x);
    		System.out.println("Outer class x is:"+ Outer.this.x);
    	};
    };
    public void start(){
    	new Inner().go();
    	
    }	
	
}