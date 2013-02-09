public class WrapTest {
    public static void main(String[] args) {
       Integer i1=new Integer(11);
       Integer i2=new Integer("22");
       Integer  i3=Integer.valueOf("33");
       Integer  i4=Integer.valueOf("101",2);
       System.out.println("i1 "+ i1+" i2 "+ i2+" i3 "+ i3+" i4 "+ i4+"\n");
       
       int i5=Integer.parseInt("55");
       
       
       System.out.println(" i4: "+i4.toString());
       System.out.println(" i6: "+Integer.toString(66));
       
       System.out.println(" i5: " +Integer.toHexString(15));
       
       int i7=i1.intValue();
       System.out.println(" i7: "+i7);
       
    }
}
