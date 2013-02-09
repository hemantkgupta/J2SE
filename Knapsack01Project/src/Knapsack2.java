
public class Knapsack2 {
	
	public static void main(String[] args) {
		
		int[] w = {0,4,3,2,1};
		int[] v = {0,7,5,3,1};
		int wt = 6;
		int[][] A = new int[v.length][wt+1];
		for (int i = 0; i < v.length; i++)
			A[i][0]=0;
		for (int j = 0; j <= wt; j++)
			A[0][j]=0;
		for (int i = 0; i < v.length; i++) 
			for (int j = 0; j <=wt; j++) {
				A[i][j]= knapsack(w,v,i,j);
			}
		printMatrix(A);
		
	}
	public static int knapsack(int[] w,int[] v, int i, int j){	
		
		    if (i == 0 || j == 0)
		    	return 0;
		    if (w[i] > j)
		    	return  knapsack(w, v, i-1, j);
		    else{ 
		    	return Math.max( knapsack(w,v, i-1, j), (v[i] + knapsack(w,v, i-1, j - w[i])) );
	}

}
	public static void printMatrix(int[][] a){
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			
		}
	}
}
