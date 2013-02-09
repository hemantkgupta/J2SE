import java.util.*;

public class Group extends HashSet<Person> {
    
    public static void main(String[] args) {
        Group g=new Group();
        g.add(new Person("Hemant"));
        g.add(new Person("Hemant"));
        System.out.println("Total :"+g.size());
    }
    public boolean add(Person o){
    	System.out.print("Adding :"+o);
    	return super.add(o);
    }
}
class Person{
	private final String name;
	public Person(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
	public boolean equals(Object o){
		if((o instanceof Person) && (((Person)o).name==this.name)){
			return true;
		}
		else{
			return false;
		}
	}
	public int hashCode(){
		return 15*name.hashCode(); 
	}
}
