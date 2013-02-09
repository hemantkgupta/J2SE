
class StaticInConstructor {
	static int x=7;
	
	

}
public class TestSubClassStaticInConstructor extends StaticInConstructor{
	
	static int y = 8;
	
	TestSubClassStaticInConstructor(){
		System.out.println("Static variable y is: "+ y);
		System.out.println("Static variable y (using this) is: "+ this.y);
		System.out.println("Static variable x from Super Class is: "+ x);
		System.out.println("Static variable x (using this)from Super Class is: "+ super.x);
	}
	
public static void main(String[] args){
		
	TestSubClassStaticInConstructor t = new TestSubClassStaticInConstructor();
	}
	
}