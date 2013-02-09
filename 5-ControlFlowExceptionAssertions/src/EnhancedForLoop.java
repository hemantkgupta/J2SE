
public class EnhancedForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4};
		for(int x = 0; x < a.length; x++)   // basic for loop
		  System.out.print(a[x]);
		for(int n : a)                      // enhanced for loop
		  System.out.print(n);




	}

}
