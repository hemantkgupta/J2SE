import java.util.*;
public class ConvertListToArray {
    public static void main(String[] args) {
        List<Integer> il=new ArrayList<Integer>();
        for(int x=0;x<5;x++){
        	il.add(x+3);
        }
        //Object[] oa=il.toArray();
        Integer[] ia=new Integer[3];
        ia=il.toArray(ia);
        for(Integer i:ia){
        	System.out.print(" " + i);
        }
        List l= Arrays.asList(ia);
        System.out.println("\n size is "+l.size());
        System.out.println("List is"+l);
   }
}
