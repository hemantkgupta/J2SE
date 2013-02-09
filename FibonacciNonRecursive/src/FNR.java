
public class FNR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FNR f1 = new FNR();
		f1.withZeroAsFirstTerm(5);
		f1.withOneAsFirstTerm(5);
		
	}
	public void withZeroAsFirstTerm(int n){
		int f_2;
		int f_1= 1; 
		int f= 0; 
		for (int i=2; i<=n; ++i) { 
		f_2 = f_1; 
		f_1 = f; 
		f= f_1 + f_2; 
		} 
		System.out.println("Starting from zero.For n: "+n+" value is :"+f);
	}
	public void withOneAsFirstTerm(int n){
		int f_2;
		int f_1= 1; 
		int f= 1; 
		for (int i=3; i<=n; ++i) { 
		f_2 = f_1; 
		f_1 = f; 
		f= f_1 + f_2; 
		} 
		System.out.println("Starting from one.For n: "+n+" value is :"+f);
	}

}
