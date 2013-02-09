public class Foo {
   		static int x=7;
    	static void change(int x){
    		x=x+50;
    		System.out.println("x inside change is  :"+x);
    	}
        public static void main(String[] args) {
        change(2);
        System.out.println("x is :"+x);
    }
}
