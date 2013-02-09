public class RefTest {
    public static void main(String[] args) {
    	BZ b=new BZ();
    	b.aMethod();
        BZ b1 =new C();
        C c= (C)b1;
        c.aMethod();
        String[] s=c.bMethod();
        System.out.println("It ius returned :"+s[1]);
        
    }
}

class AZ{
	public void aMethod(){
		System.out.println("INside  A");
	}
}
class BZ extends AZ{
	public void aMethod(){
		System.out.println("INside  B");
	}
}

class C extends BZ{
	public void aMethod(){
		System.out.println("INside  C");
	}
	public String[] bMethod(){
		return  new String[] {"Hi","Hemant"};
	}
}
