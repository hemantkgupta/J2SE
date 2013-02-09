import java.util.*;
public class MixLegacyAndGeneric {
    public static void main(String[] args) {
        List<Integer> mylist=new ArrayList<Integer>();
        mylist.add(4);
        Inserter in=new Inserter();
        in.insert(mylist);
        System.out.println("List contains:"+mylist);
        System.out.println(mylist.get(2));
        int x=(mylist.get(2)).length();        
    }
}
class Inserter{
	public void insert(List list){
		list.add(new Integer(42));
		list.add(new String("Hemant"));        //possible but  
	}
} 