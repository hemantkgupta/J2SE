import java.util.*;

public class PolyAndGenerics {
    
    public static void main(String[] args) {
    	List<Animal> a=new ArrayList<Animal>();
    	
    	//List<Animal> c=new ArrayList<Dog>(); incompatable types
    	//List<Dog> cc=new ArrayList<Animal>(); //incompatable types
    	
    	a.add(new Animal());
    	a.add(new Dog());
    	
    	List<Dog> d=new ArrayList<Dog>();
    	d.add(new Dog());
    	// d.add(new Animal());
    	
    	PolyAndGenerics p=new PolyAndGenerics();
    	p.done(a);
    	//p.done(d);
    	
    	p.done1(a);
    	p.done1(d);
    	
    	p.done2(a);
    	//p.done2(d);      only super to Animal can be passed
    	
    	List<Living> l=new ArrayList<Living>();
    	p.done2(l);         // can pass super Animal
        
    }
    public void done(List<Animal> an){
    	an.add(new Animal());
    	an.add(new Dog());
    }
    public void done1(List<? extends Animal> an){
    	// an.add(new Animal());     can not add only pass is-Animal   
    	// an.add(new Dog());        also can not add which pass is-Animal 
    }
    public void done2(List<? super Animal> an){
    	an.add(new Animal());
    	// an.add(new Living()); can not add super only pass
    }
}

class Living{
}

class Animal extends Living{
}
class Dog extends Animal{
}
