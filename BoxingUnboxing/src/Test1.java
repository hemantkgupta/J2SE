
public class Test1 {
	public static void main(String[]args){
		Integer y = new Integer(567);     // make it
		int x = y.intValue();             // unwrap it
		x++;                              // use it
		y = new Integer(x);               // re-wrap it
		System.out.println("y = " + y);   // print it

		Integer y1 = new Integer(567);     // make it
		y1++;                              // unwrap it, increment it,
		                                  // rewrap it
		System.out.println("y1 = " + y1);   // print it



	}

}
