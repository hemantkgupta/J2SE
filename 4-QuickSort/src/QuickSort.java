
public class QuickSort {
	static int cnt = 0; 
	// Compare and have a count
	static boolean less(int v, int w) 
	{ cnt++; return v < w; } 
	// Exchange 
	static void exch(int[] a, int i, int j) 
	{ int t = a[i]; a[i] = a[j]; a[j] = t; } 
	// Compare and exchange if second is less than the first
	// Check less method takes argument in reverse order so exchange only if second is less
	static void compExch(int[] a, int i, int j) 
	{ if (less(a[j], a[i])) exch (a, i, j); } 

	// recurrsive call 
	static void quickSort(int[] a, int l, int r) 
	{ 
		if (r <= l) {
			System.out.println("\nNo of elements is "+(r-l)+"so partition is not required");
			return; 
		}
		System.out.println("\nTwo or more elements are present in array so partition is needed");
		System.out.println("\nl is "+l+" and r i "+r); 
		int i = partition(a, l, r); 
		System.out.println("\nLower half call for  " + l +"to "+(i-1));
		quickSort(a, l, i-1); 
		System.out.println("\nUpper half call for " + (i+1) +"to "+r);
		quickSort(a, i+1, r); 
	}
	// do partition
	static int partition(int a[], int l, int r) 
	{ int i = l;
	int j = r;
	int v = a[r]; // last item is taken and will be put in proper place

	for (;;) 
	{ 
		while (less(a[i], v)) {i++;} 
		while (less(v, a[--j])) if (j == l) break; 
		if (i < j){
			exch(a, i, j);
		}else{
			break;
		}

	}
	// Item is placed in proper place
	exch(a, i, r);
	System.out.println("\nFollowing array has "+(i+1)+"th element placed properly");
	printData(a);
	return i;
	} 
	// invoke sort method
	static void sort(int[] a, int l, int r){

		quickSort(a, l, r);
	}
	static void printData(int[] a){
		System.out.println("");
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + " "); 
	}
	// Driver  
	public static void main(String[] args) 
	{ // Populate an array with data
		int N = 3; 
		int a[] = {4,3,6};
		//Before sorting data
		System.out.println("Before sort");
		printData(a);
		// Run sorting arguments are array,its first index and last index
		sort(a, 0, N-1); 
		// After sorting print data
		System.out.println("\nAfter sort");
		printData(a);
		// print no of comparision 
		System.out.println("\nCompares used: " + cnt); 
	} 


}

