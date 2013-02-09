import java.util.Arrays;


public class MergeSortComplete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {6,2}; 
		mergeSort(a,0,1);
		System.out.println(a[0]+" "+a[1]+" " );
		//Arrays.asList(a)
		
	}
	public static void merge(int[] a,int p,int q,int r){
		
		int n1=q-p+1;// no of elements from p to q
		int n2=r-q;// no of elements from q to r
		//two array to hold elements with size is incremented 
		int[] a1 = new int[n1+1];
		int[] a2 = new int[n2+1];
		
		for (int i = 0; i < a1.length; i++) {
			a1[i]=a[p+i];
			
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.println("copy q is "+q);
			a2[i]=a[q+1+i];
			
		}
		
		a1[n1]=(int)Float.POSITIVE_INFINITY;
		a2[n2]=(int)Float.POSITIVE_INFINITY;
		System.out.println("for a1"+a1[0]+" "+a1[1]+" " );
		System.out.println("for a2"+a1[0]+" "+a1[1]+" " );
		int i=0,j=0;
		for(int k =p; k <= r ;k++){
			System.out.println("i and j are "+ i+" "+j );
			if(a1[i]<= a2[j]){
				a[k]=a1[i];
				i++;
			}else{
				a[k]=a2[j];
				j++;
			}
			
		}
		
	}
	public static void mergeSort(int[] a,int p,int r){
		if(p < r){
			int q = (p+r)/2;
			System.out.println(" and q is "+ q);
			mergeSort(a,p,q);
			mergeSort(a,q+1,r);
			merge(a,p,q,r);
		}
	}

}
