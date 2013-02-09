
import java.io.*;

////////////////////////////////////////////////////////////////
class MyHeapApp
   {
   static int currentSize =0;	
   public static void main(String[] args) throws IOException
      {
      int[] a = {0,0,0,0,0,0,0,0,0,};
      display(a);
      insert(a,3); 
      insert(a,1);       
      insert(a,7); 
      insert(a,6); 
      display(a);
      remove(a);
      remove(a);
      display(a);
    
              
      }  // end main()
public static void display(int[] a){
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");
	System.out.println();
}
   
// -------------------------------------------------------------
   public static boolean insert(int[]a,int key)
      {
      a[currentSize] = key;
      trickleUp(a, currentSize++);
      return true;
      }  // end insert()
// -------------------------------------------------------------
   public static void trickleUp(int[] a,int index)
      {
      int parent = (index-1) / 2;
      int bottom = a[index];
      // find proper place for item
      while( index > 0 &&  a[parent] < bottom )
         {
         a[index] = a[parent];  // move parent element it down
         index = parent;
         parent = (parent-1) / 2;
         }  
      a[index] = bottom;
      }  // end trickleUp()
// -------------------------------------------------------------
   public static int remove(int[] a)           
      {                           
      int root = a[0];
      a[0] = a[--currentSize];
      a[currentSize]=0;
      trickleDown(a,0);
      return root;
      }  // end remove()
// -------------------------------------------------------------
   public static void trickleDown(int[] a, int index)
      {
      int largerChild;
      int top = a[index];       // save root- the value inserted from bottom
      // while node has at  least one child
      while(index < currentSize/2)      
         {                                
         int leftChild = 2*index+1;
         int rightChild = leftChild+1;
         // find larger child
         if(rightChild < currentSize &&  a[leftChild] < a[rightChild])
            largerChild = rightChild;
         else
            largerChild = leftChild;
         // if top is bigger than largerChild, work is done
         if( top >= a[largerChild] )
            break;
         // shift child up
         a[index] = a[largerChild];
         index = largerChild;            // go down
         }  // end while
      a[index] = top;            // root to index
      }  // end trickleDown()
// -------------------------------------------------------------

// -------------------------------------------------------------
  }  // end class HeapApp
////////////////////////////////////////////////////////////////
