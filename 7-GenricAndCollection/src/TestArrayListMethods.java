import java.util.*;
public class TestArrayListMethods {
	public static void main (String [] args){
		List<String> list=new ArrayList<String>();
		String s="hi";
		list.add("String");
		list.add(s);
		list.add(s+s);
		System.out.println(list.size());
		System.out.println(list.contains(42));
		System.out.println(list.contains("hihi"));
		list.remove("hi");
		System.out.println(list.size());
		
		
		
	}
}
