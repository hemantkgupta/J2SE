
public class A {
	static int i=1;
	int j=2;
	public static void main(String[] args){
			System.out.println("Hi");
			System.out.println("Hi"+B.x);
			System.out.println("Hi"+new B().y);
			new B().nonstatic();
	}
	public void test(){
			System.out.println("Hi"+B.x);
			System.out.println("Hi"+new B().y);
	}
	
	
	interface C{
		public void doIt();
	}
		
	public static class  B implements C{
		static int x=10;
		int y=11;
		
		public void nonstatic(){
			doIt();
			System.out.println("Hi");
			System.out.println("Hi"+i);
		//	System.out.println("Hi"+j);
		//	test();
			System.out.println("Hi"+ new A().j);
		}
		public static void staticmethod(){
			System.out.println("Hi"+i);
		//	System.out.println("Hi"+j);
		//	doIt();
			System.out.println("Hi"+ new A().j);
		}
		
		public void doIt(){
			System.out.println("Hi");	
		}
		
	}
    
    
}