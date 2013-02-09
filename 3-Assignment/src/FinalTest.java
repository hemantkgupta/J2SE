
public class FinalTest {
    
    public static void main(String[] args) {
        test(1<<32,"1<<32");
        test(1<<31,"1<<31");
        test(1<<30,"1<<30");
        test(1,"1");
        test(-0,"0");
        test(-1,"-1");
        int i=0;
        addtwo(i++);
        System.out.println(1<<30);
    }
    static void addtwo(int i){
    	i+=2;
    } 
    public static void test(int i,String exp){
    	if((i>>1)!=(i>>>1))System.out.println(exp);
    }   
        
}
