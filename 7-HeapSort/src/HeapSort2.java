
public class HeapSort2 {
	
	public static void main(String[] args){
		
		int[] a ={0,3,6,4,1,5,8,7,2,9};
		printData(a);
		heapSort(a);
		printData(a);	
		
	}
	public static void heapSort(int[] a){
		heapify(a);
		printData(a);
		int heapSize = a.length-1;
		for(int i=a.length-1;i>1;i--){
			swap(a,1,i);
			printData(a);
		    heapSize--;
		    System.out.println("running for heapsize "+heapSize);
			maxHeapify(a, heapSize, 1);
			printData(a);
		}		
	}
	public static void maxHeapify( int[] a,int heapSize, int i){
		
		int largest;		
		int l = 2*i;
		int r = 2*i+1;
//		System.out.println("Left is "+l+" and right is "+r);
//		System.out.println("a[l] "+a[l]);
//		System.out.println("a[r] "+a[r]);
//		System.out.println("a[i] "+a[i]);
		if(l<= heapSize && a[l]>a[i])
		 largest = l;
		else
		 largest = i;		
		if(r<= heapSize && a[r]>a[largest])
			 largest = r;
		System.out.println("index for largest is "+largest);
		//System.out.println("index of i is "+i);
		if(largest != i){			
		 swap(a,i, largest);
		 maxHeapify(a,heapSize,largest);
		 }	
}	

	public static void swap(int[] a, int x, int y){
		int temp = a[y];
		a[y]=a[x];
		a[x]=temp;
	}
	
	public static void heapify(int [] a){
		int heapSize = a.length-1;
	    int x = a.length/2-1;
	    System.out.println("x is " + x);
		for(int i=x;i>=1;i--){
		System.out.println("Calling maxHeapify with i  " + i);	
		maxHeapify(a,heapSize,i);
		
	}

}
	static void printData(int[] a){    	
    	 for (int i = 1; i < a.length ; i++) 
             System.out.print(a[i] + " "); 
    	 System.out.println("");
    }
}
