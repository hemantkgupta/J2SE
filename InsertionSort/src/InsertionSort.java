////////////////////////////////////////////////////////////////
class InsertionSort
  {
  public static void main(String[] args)
   {
	  int[] a = {2,6,4,3,5,7,8,9,1};
	   display(a);
	   insertionSort(a);
	   display(a);
   } // end main()
//--------------------------------------------------------------
  public static void insertionSort(int a[])
   {
   int j, i;
   
    // start with second item in array
   for(i=1; i<a.length; i++)   
     {
	 
     int key = a[i];      
     j = i-1;           
     
     //find correct position for of marked item in sorted array 
     // from 0 to before the marked item
     // just change inequality operator to reverse order
     while(j >=0 && a[j] > key) 
      {
      // shift left and create place for marked item	 
      a[j+1] = a[j];     
      --j;            
       }
     //insert marked item
     a[j+1] = key;        
     } // end for
   } // end insertionSort()
//--------------------------------------------------------------
  private static void swap(int[] a,int one, int two)
  {
  int temp = a[one];
  a[one] = a[two];
  a[two] = temp;
  }
//--------------------------------------------------------------
  public static void display(int[] a)       // displays array contents
   {
   for(int j=0; j<a.length; j++)    // for each element,
     System.out.print(a[j] + " "); // display it
   System.out.println("");
   }
//--------------------------------------------------------------
  } // end class InsertSortA

