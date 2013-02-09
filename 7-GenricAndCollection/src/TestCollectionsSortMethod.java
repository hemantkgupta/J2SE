import java.util.*;
public class TestCollectionsSortMethod {
    public static void main(String[] args) {
    	List l=new ArrayList();
    	l.add("Hi");
    	l.add("Hemant");
    	l.add("Kanpur");
    	l.add("Lucknow");
    	l.add("NewDelhi");
    	l.add("Dhanbad");
    	l.add("Kolkata");
    	l.add("Bangalore");
    	l.add("Channai");
    	System.out.println("Unsorted data "+ l);	
    	Collections.sort(l);
    	System.out.println("Sorted data "+ l);		
    }
}
