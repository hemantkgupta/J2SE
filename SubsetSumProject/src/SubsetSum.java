import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SubsetSum {	
	
	public static void main(String[] args) {
		
		int[] a = {1,4,5,7,9,11,13,14,16,18,19,21,22,23,24,25,26,27,29,31};
		Set s = new TreeSet();
		s.add(0);
		for (int i = 0; i <= a.length-1; i++) {
			s = mergeList(s,a[i]);
			System.out.println(s);
			s = trim(s, (0.1/12));
			remove(s,100);		
		}
		System.out.println(s);
		
//		Set test = new TreeSet();
//		test.add(10);		
//		test.add(11);
//		test.add(12);
//		test.add(15);
//		test.add(20);
//		test.add(21);
//		test.add(22);
//		test.add(23);
//		test.add(24);
//		test.add(29);
//		System.out.println("before trim "+test);
//		test = trim(test,0.1);
//		System.out.println("after trim "+test);
//		
	}
	public static  Set mergeList(Set s, int incre){	
		Iterator i = s.iterator();
		Set stemp = new TreeSet();
		while(i.hasNext()){
			int temp = (Integer)i.next();
			stemp.add(temp+incre);
		}
		return stemp;
		
	}
	
	public static void remove(Set s,int limit){
		
		Iterator i = s.iterator();
		while(i.hasNext()){
			int x = (Integer)i.next();
			if(x >=7) s.remove(x);
		}
		
	}	
	public static Set trim(Set s, double delta){
		Set stemp = new TreeSet();
		Iterator i = s.iterator();
		if(i.hasNext()){
		int temp = (Integer)i.next();
		stemp.add(temp);
		while(i.hasNext()){			
			int current = (Integer)i.next();
			int compare = (int)(temp *(1.0 + delta));
			if(current > compare){
				stemp.add(current);
				temp=current;
			}
			
		}
		}
		return stemp;
		
		
	}

}
