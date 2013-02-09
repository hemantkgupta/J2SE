
public class AssignmentTest {
    
    public static void main(String[] args) {
       // boolean x=true;
        char x=(char)65537;
        long i=(long)123.45;
       // Long l=123l;
        Integer j=1234;
      //  String s=Long.toBinaryString(l);
       // String r=Long.toHexString(l);
       // String t=Long.toOctalString(l);
        String s=Long.toBinaryString(j);
        String r=Long.toHexString(j);
        String t=Long.toOctalString(j);
        
        System.out.println("testing"+x+i+s+r+t);
    }
}
