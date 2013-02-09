public class B{
	static int i=1;
	int j=2;
	public static void main(String[] args){
			System.out.println("Hi");
		//	System.out.println("Hi"+new C().z);  this cannot be referenced from static context
	}
	public void test(){
			System.out.println("Hi"+new C().z);
			System.out.println("Hi"+new C().y);
	}	
	interface D{
		public void doIt();
	}
	public class  C implements D{
		//	static int x=10;			cannot have static member
		final static int z=12;
		int y=11;
		
		public void nonstatic(){
			doIt();
			System.out.println("Hi"+i);
			System.out.println("Hi"+j);
			
			System.out.println("Hi"+ B.this.i);
			System.out.println("Hi"+ B.this.j);
			
			System.out.println("Hi"+ new B().j);
			System.out.println("Hi"+ new B().i);
		}
		public void doIt(){
			System.out.println("Hi");	
		}
		
	}
    
    
}