import java.util.*;

public class AnimalDoctorGenric {
    public static void main(String[] args) {
        
        List<Animal> animals=new ArrayList<Animal>();
        
        
        animals.add(new Dog());
               
        AnimalDoctorGenric doc=new AnimalDoctorGenric();
        doc.doSome(animals);
    }
    
    public void doSome(List<? super Dog> a){
    	a.add(new Animal());
	}
}

class Animal{
}

class Dog extends Animal{
}

class Cat extends Animal{
}
