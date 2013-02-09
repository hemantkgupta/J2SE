import java.util.*;

public class gen {
    
    public static void main(String[] args) {
        G<Integer> i= new G<Integer>(new Integer(10) );
        G<Integer> i1= new G<Integer>(10 );
        System.out.print((Integer)i.getG());
        	
    }
}
class G<T>{
	T obj;
	G(T o){
		obj=o;
	}
	T getG(){
	 return obj;	
	}
}