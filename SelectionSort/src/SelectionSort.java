
////////////////////////////////////////////////////////////////
class SelectSort
  {
  public static void main(String[] args)
   {
	  
   int[] a = {2,6,4,3,5,7,8,9,1};
   display(a);
   selectionSort(a);
   display(a);
   } // end main()
  
//--------------------------------------------------------------
  public static void display(int[] a)       // displays array contents
   {
   for(int j=0; j<a.length; j++)    // for each element,
     System.out.print(a[j] + " "); // display it
   System.out.println("");
   }
//--------------------------------------------------------------
  public static void selectionSort(int[] a)
   {
   int i, j, min;

   for(i=0; i<a.length-1; i++)  // outer loop
     {
	 // Write this loop first where you have to select minimum of array and swap it with leftmost unsorted  
     min = i;           // minimum     
     for(j=i+1; j<a.length; j++) // inner loop
      if(a[j] < a[min] )     // if min greater,
        min = j;        // we have a new min
     swap(a,i, min);        // swap them
     } // end for(out)
   } // end selectionSort()
//--------------------------------------------------------------
  private static void swap(int[] a,int one, int two)
   {
   int temp = a[one];
   a[one] = a[two];
   a[two] = temp;
   }
//--------------------------------------------------------------
  } // end class SelectSortApp
