import java.util.regex.*;
import java.util.*;
import java.text.*;
public class E {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuffer s=new StringBuffer();
        StringBuffer ss=null;
        s.append(ss);
        s.insert(0,"123");
        System.out.println(s);
        print(3.0);
        double dd=223.4578;
        System.out.printf("%.2f",dd);
        Pattern p=Pattern.compile("x*y");
        Matcher m=p.matcher("xxyy");
        //boolean b=false;
        while(m.find()){
			System.out.println(m.start());
        }
        Date d=new Date();
        DateFormat df=DateFormat.getDateInstance();
        df.setTimeZone(TimeZone.getTimeZone("CST"));
        System.out.println(df.format(d.getTime()));
    }
    private static void print (Float f){
    	System.out.println("float");
    }
    private static void print (Number f){
    	System.out.println("t");
    	
    }
}
