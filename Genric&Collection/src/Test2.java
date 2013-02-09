
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
	String artist;
	Dog(){}
	Dog(String s){title=s;}
	public int compareTo(Animal a){
		return title.compareTo(a.getTitle());
	}
	public String getArtist(){
		return artist;
	}
}
public class Test2{
	ArrayList<Dog> alist=new ArrayList<Dog>();
	public static void main(String[] args){
			new Test2().go();
	}
	public void go(){
		getAnimals();
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
	}
	public void getAnimals(){
		try{
			File file =new File("Animal.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line=null;
			while((line=br.readLine())!=null)
				addAnimal(line);
		}catch(IOException e){ e.printStackTrace();}
	}	
	public void addAnimal(String lineToParse){
		String[] tokens=lineToParse.split("/"); 
		Dog nextDog=new Dog(tokens[0]);
		alist.add(nextDog);
	}
		
	}
