import java.util.regex.*;
public class B{
    <T> B(T x){}
    public static void main(String[] args) {
        Pattern p=Pattern.compile("fni");
        Matcher m=p.matcher("bj fni noeif fni bcuqech w n");       
        boolean b=false; 
        while(b=m.find()){
        	 System.out.println(m.start()+ " ");
        }
    }
    
     
    public static<T> void amethod(T x){
    	
    
    }
}
