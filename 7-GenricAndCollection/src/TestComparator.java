import java.util.*;
public class TestComparator {
   public static void main(String[] args) {
      String [] sa={"one","two","three","four" };
      Arrays.sort(sa);
      for(String s:sa){
      	System.out.print(s+" ");
      }
      System.out.println("\n one ="+Arrays.binarySearch(sa,"one"));
      System.out.println("new reverse sort");
      ReSortComparator rs=new ReSortComparator();
      Arrays.sort(sa,rs);
      for(String s:sa){
      	System.out.print(s+" ");
      }
      System.out.println("\n one ="+Arrays.binarySearch(sa,"one"));
      
      System.out.println(" one = " + Arrays.binarySearch(sa,"one",rs));
      
      
   }
}

 class ReSortComparator implements Comparator<String>{
	public int compare(String a,String b){
		return b.compareTo(a);
	}
		
}       
      	
      
      	
      	
      	
      	
      	
      	
      	
   