class Animal{
	public void eat() throws Exception{
		throw new Exception();
	}
}
public class Dog2 {
    public void eat(){    };
    public static void main(String[] args)throws Exception{
        Animal a=new Animal();
        a.eat(); // throws exception
        Dog2 d=new Dog2();        
        d.eat();
       
    }
}
