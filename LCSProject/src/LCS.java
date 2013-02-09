
public class LCS {
	public static void main(String[] args) {

		char[] x ={'N','A','B','C','B','D','A'};
		char[] y ={'N','B','D','C','A','B','A'};

		int [][] c = new int[8][8]; 
		char[][] b = new char[8][8];
		

		for (int i = 0; i <= x.length; i++) {
			c[i][0]=0;
			b[i][0]='N';
		}
		for (int j = 0; j <= y.length; j++) {
			c[0][j]=0;
			b[0][j]='N';

		}
		for (int i =1; i < x.length; i++) 
			for (int j=1; j< y.length; j++) {
				if(x[i]==y[j]){
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]='o';
				}else if( c[i-1][j]>= c[i][j-1]){
					c[i][j]=c[i-1][j];
					b[i][j]='u';					
				}else{ 
					c[i][j]=c[i][j-1];
					b[i][j]='l';
			}
			}		
		printData(b,x,x.length-1,y.length-1);

	}
	public static void printData(char[][] b, char[] x, int i, int j){
		
		if(i==-1 || j==-1)
			return;
		if(b[i][j]=='o'){
			printData(b,x,i-1,j-1);
			System.out.println(x[i]+ " ");
		}else if(b[i][j]=='u'){
			printData(b,x,i-1,j);
		}else if(b[i][j]=='l'){
			printData(b,x,i,j-1);
		}	
		
	}
}
