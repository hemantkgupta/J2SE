
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=5,b=10;a=a+b; b=a-b; a=a-b;
		System.out.println(a);
		System.out.println(b);
		*/
		int a = 5; int b = 10;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println(a);
		System.out.println(b);
		boolean c = false;
		try{
			if (c){
				while(true);
			}else{
				System.out.println("Inside false");
				System.exit(1);
			}
		}
		finally{
			System.out.println("Test");
		}


	}

}
