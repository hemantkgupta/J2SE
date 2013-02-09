

public class Boxing2 {
    static Integer x;
    public static void main(String[] args) {
        dostuff(x);
        System.out.println(x);
        int y=Integer.parseInt("10",2);
        System.out.println(y);
    }
    static void dostuff(Integer z){
    	z=3;
    	System.out.println(z);
    }
}
