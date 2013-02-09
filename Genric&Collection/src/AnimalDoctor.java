import java.util.*;
public class AnimalDoctor {
        public void checkAnimal(ArrayList<Animal> animal){
        	for(Animal a :animal){
        		a.checkup();
        	}
        }
        public static void main(String [] args){
        	List<Dog> dogs=new ArrayList<Dog>();
        	dogs.add(new Dog());
        	dogs.add(new Dog());
        //	Cat[] cats={new Cat(),new Cat()};
        //	Birds[] birds={new Birds(),new Birds()};
        	
        	AnimalDoctor doc=new AnimalDoctor();
        	doc.checkAnimal(dogs);
        //	doc.checkAnimal(cats);
        //	doc.checkAnimal(birds);
        }
    }

abstract class Animal{
	public abstract void checkup();
} 

class Dog extends Animal{
	public void checkup(){
		System.out.println("Checkup of Dogs");
	}
} 
class Cat extends Animal{
	public void checkup(){
		System.out.println("Checkup of Cats");
	}
} 
class Birds extends Animal{
	public void checkup(){
		System.out.println("Checkup of Birds");
	}
}           