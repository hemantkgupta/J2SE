

public class WrapperTest {
     
    public static void main(String[] args) {
        Integer i=new Integer(7);
        Short  s=new Short((short)6);
        double j=7.0;
        System.out.println(i==j); // Compare Wrapper to primitive OK
        System.out.println(i.equals(j));         // equals to compare wrapper and primitive
        //System.out.println(i==s);               //Compare Two diff Wrapper type NOT OK
        System.out.println(i>s);
    }
}
