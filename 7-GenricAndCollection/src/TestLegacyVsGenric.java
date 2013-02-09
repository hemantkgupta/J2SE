import java.util.*;

public class TestLegacyVsGenric {
    public static void main(String[] args) {
        List legacy=new ArrayList();
        legacy.add("Hemant");
        legacy.add(new Integer(42));
        
        //Integer x=(Integer)legacy.get(0);      ClassCastException
        
        System.out.println("Legacy can have :"+legacy);
        List<String> generic=new ArrayList<String>();
        generic.add("Hemant");
        
        // generic.add(new Integer(42));          compile time error
       
        generic.get(0);
        System.out.println("Legacy can have :"+generic);
        String s=(String) new TestLegacyVsGenric().getLegacy().get(0);  //ClassCastException
    }
    public void genricListOfStrings(List<String> list){
    	list.add("Kumar");
    	
    	//list.add(new Integer(43));          compiler error
    }
    public void legacyListOfString(List list){
    	list.add("Kumar");
    	list.add(new Integer(43));
    }
    public Set<Integer> getGenric(){
    	Set<Integer> g=new HashSet<Integer>();
    	g.add(new Integer(44));
    	return g;
    }
    public List getLegacy(){
    	List l=new ArrayList();
    	l.add(new Integer(44));
    	l.add("Gupta");
    	return l;
    }
}
