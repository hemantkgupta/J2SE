public class ClassCastTest {
    public static void main(String[] args) {
    	
    	int a = 5;
    	// primitive casting is possible
    	System.out.println("Checking "+(long)a);
    	 
        Number x=new Integer(5);
        // Integer cannot be casted to Long
        //System.out.println("Checking"+(Long)x);
    }
}
