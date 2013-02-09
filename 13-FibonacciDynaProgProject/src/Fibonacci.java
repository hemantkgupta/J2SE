
public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		int v = f.fibRec(7);
		System.out.println(v);
		int v1 = f.fibDynaProg(7);
		System.out.println(v1);
		
		
	}
	public int fibRec(int n){
		if(n == 0) return 0;
		if(n==1)return 1;
		return fibRec(n-1)+ fibRec(n-2);
		
	}
	public int fibDynaProg(int n){
		int n2 = 1;
		int n1 = 0;
		for (int i = n ; i > 2; i--) {
			int temp = n2;
			n2 = n1 + n2;
			n1 = temp;		
			
		}
		return n1+n2;
		
	}

}
