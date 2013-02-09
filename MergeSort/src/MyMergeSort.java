public class MyMergeSort {	
	
   public static  void merge(int[] output,int[] input,int lowPtr,int highPtr,int upperBound){
	      int j = 0;                             
	      int lowerBound = lowPtr;
	      int mid = highPtr-1;
	      int n = upperBound-lowerBound+1;       // # of items
	     
	      while(lowPtr <= mid && highPtr <= upperBound)
	         if( input[lowPtr] < input[highPtr] )
	            output[j++] = input[lowPtr++];
	         else
	            output[j++] = input[highPtr++];

	      while(lowPtr <= mid)
	         output[j++] = input[lowPtr++];

	      while(highPtr <= upperBound)
	         output[j++] = input[highPtr++];
          
	      for(int p=0; p<n; p++)
	         input[lowerBound+p] = output[p];
   }
   
 //-----------------------------------------------------------
   public static void recMergeSort(int[] output,int[] input, int lowerBound, int upperBound)
      {
	   
      if(lowerBound == upperBound){  
    	 System.out.println("Only one item so no need of sorting");
         return;  
      }
      else
         { 
    	 
    	 // find midpoint
         int mid = (lowerBound+upperBound) / 2; // floor value
         
         //sort low half
         System.out.println("call to recMergeSort lower half with lowerbound "+lowerBound +" and upperbound is "+mid);                                      // sort low half
         recMergeSort(output,input, lowerBound, mid);
         
          // sort high half
         System.out.println("call to recMmergeSort upper half with lowerbound "+(mid+1) +" and upperbound is "+upperBound);   
         recMergeSort(output,input, mid+1, upperBound);
         
         // merge them
         System.out.println("\ncall to merge from " + lowerBound + " to " + upperBound); 
         merge(output,input,lowerBound, mid+1, upperBound);
         }  // end else
      }
	
	
	public static void main(String [] args){
		int a[] = {5,2,3,6};
		int b[] = new int[4];
		System.out.println("Before merge ");
		  for(int j=0; j< a.length; j++)
		System.out.println(a[j]+" ");
		 recMergeSort(b,a,0,3);
	//	merge(b,a,0,0,0); 
	//	merge(b,a,0,1,1);
		
		System.out.println("After merge ");
		  for(int j=0; j<b.length; j++)
		System.out.println(b[j]+" ");
		

}
	}
