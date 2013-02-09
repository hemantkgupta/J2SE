

public class AnimalTest {
    
    public static void main(String[] args) {
      //  AnimalHouse<Animal> house = new AnimalHouse<Cat>();

	//	AnimalHouse<Dog> house = new AnimalHouse<Animal>();

		AnimalHouse<?> house = new AnimalHouse<Animal>(); 
			house.setAnimal(new Animal());

	//	AnimalHouse house = new AnimalHouse(); house.setAnimal(new Dog());


    }
}

 class AnimalHouse<E> {
  private E animal;
  public void setAnimal(E x) {
    animal = x;
  }
  public E getAnimal() {
    return animal;
  }
}

 class Animal{
}
 class Cat extends Animal {
}

 class Dog extends Animal {
}

