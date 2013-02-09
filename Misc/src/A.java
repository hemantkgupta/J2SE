import java.util.regex.*;
import java.util.*;
import java.text.*;
public class A {
    
    public static void main(String[] args) {
        String s="10 apples 20 eoem";
        System.out.println(Arrays.toString((s.split("\\s",-20))));
        Scanner sc=new Scanner(s).useDelimiter(" ");
        while(sc.hasNext())
        	System.out.println(sc.next());
        sc.close();	
        StringBuffer s1=new StringBuffer("Hello");	
        StringBuffer s3=s1;	
       	System.out.println("HI"+s1.equals(s3));
       	StringBuffer s2=new StringBuffer("Hello");
       	Float f=2.0f;
       	Double d=2.0;
       	System.out.println(s1.equals(s2));	
       		System.out.println(s1==s2);	
       Integer i1=3;
       Integer i2=4;
       Integer i3=Integer.valueOf("4");
       int i=i1+i2+i3;			
       System.out.println(i);	
       Character c=65;
       Character dd=new Character('0');
       char cc=dd;
       int x=cc;
       System.out.println(x);
       if(c<dd)	{System.out.println(dd);}	
       	else
       		{System.out.println(c);  }
       String a=new String("Hi");
       String b=new String(a);
       char [] aa={'H','i'};
       System.out.println(a.equals(b));	
       System.out.println(a==b);
       System.out.println(a.equals(aa));
       try{
      
       NumberFormat nm=NumberFormat.getCurrencyInstance(Locale.US);
       Number n=nm.parse("$5,000.56");
       String aaa=nm.format(111111);
       System.out.println(aaa);
       System.out.println(n);
       }catch(Exception e){System.out.println("caught");}
        			
}
}
