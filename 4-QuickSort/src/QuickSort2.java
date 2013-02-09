public class QuickSort2 {

	
	public static void main(String[] args) {
		int a[] = {2,6,4,5,8,7,3,9,1};
		printData(a);
		QuickSort2 qs = new QuickSort2();
		qs.sort(a);
		printData(a);

	}
	public void sort(int[] a){		
		quickSort(a, 0, a.length-1);
			
	}
	
	public void quickSort(int[] a , int p, int r){
		if(p< r){
			int q = partition(a,p,r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
	}
	
	public int partition(int[] a, int p, int r){
		int pivot = a[r];
		int i=p-1;
		for (int j =p; j <= r-1; j++) {
			if(a[j]<=pivot){
				i=i+1;
				swap(a,i,j );
			}
			
		}
		swap(a,i+1,r);
		return i+1;
	}
public void swap(int[] a, int x, int y){
	int temp = a[x];
	a[x]=a[y];
	a[y]= temp;
	
}
public static void printData(int[] a){
	System.out.println();
	for (int x : a){
		{
		System.out.print(x +" ");	
	}
		
	}
}
}
