public class EnumTest {
	enum Foo { ONE,TWO,THREE  }
   public static void main(String[] args) {
   		Foo x=Foo.ONE;
   		Object s=x;
   		String y=s.toString();
        System.out.println("It is enum test:"+x);
        System.out.println("enum is assigned to a Object  :"+ s);
        System.out.println("enum to Object to a String  :"+ y);
    }
    
}
