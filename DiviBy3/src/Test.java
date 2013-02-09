
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.print(t.DivBy3(50));

	}
	public int DivBy3(int x) 
	  { 
	     int q; 
	     for (q=0;x>2;x-=3,q++); 
	     return q; 
	   } 

}
