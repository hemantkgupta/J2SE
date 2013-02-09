
import java.util.*;
import java.io.*;
 class Animal {
	String title; 
	Animal(String s) {
		title=s;
	}
	Animal(){}
	public String getTitle(){
		return title;
	}

}
class Dog extends Animal implements Comparable<Animal>{
	
	Dog(){}
	Dog(String s){title=s;}
	public int compareTo(Animal a){
		return title.compareTo(a.getTitle());
	}
	public String toString(){
		return title;
	}
	
}
public class TestComparable{
	ArrayList<Dog> alist=new ArrayList<Dog>();
	public static void main(String[] args){
			new TestComparable().go();
	}
	public void go(){
		alist.add(new Dog("coic"));
		alist.add(new Dog("ncioq"));
		alist.add(new Dog("mcic"));
		alist.add(new Dog("cnweco"));
		alist.add(new Dog("fko3f"));
		System.out.println("Before Sorting the list of Dogs");
		for(Dog d:alist)
		System.out.println(d);
		Collections.sort(alist);
		System.out.println("After Sorting the list of Dogs");
		for(Dog d:alist)
			System.out.println(d);
	}
	
	}
