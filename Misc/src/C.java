import java.util.*;

public class C {
    
    public static void main(String[] args) {
        List<Object> l=new LinkedList<Object>();
        l.add("A");
        addTo("B",l);
        System.out.println(l);
        List<Number> ll=new LinkedList<Number>();
        ll.add(13);
        ll.add(12.3f);
        System.out.println(ll);
        
    }
    public static  void addTo(Object o ,List<Object> list){
    	list.add(o);
    }
}
