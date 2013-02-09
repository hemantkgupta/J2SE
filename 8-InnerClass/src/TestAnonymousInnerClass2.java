public class TestAnonymousInnerClass2 {
    class Food {
    	Popcorn p=new Popcorn(){
    		public void pop(){
    			System.out.println("ANNONYMOUS SUBCLASS OF POPCORN");
    			sizzle();
    		}
    		public void sizzle() {
    	        System.out.println("anonymous sizzling popcorn");
    	      }

    	};
    	public void test1(){
    		p.pop();
    	}
    	
    	
    };    
    public static void main(String[] args) {
        new TestAnonymousInnerClass2().new Food().p.pop();
        new TestAnonymousInnerClass2().new Food().test1();
        //new InnerTest3().new Food().p.sizzle();
    }
}
class Popcorn{
	public void pop(){
	}
}
