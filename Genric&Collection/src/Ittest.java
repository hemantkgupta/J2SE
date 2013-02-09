import java.util.*;
public class Ittest {
   public static void main(String[] args) {
       List<Dog> l=new ArrayList<Dog>();
       Dog d=new Dog("aiko");
       l.add(d);
       l.add(new Dog("clover"));
       l.add(new Dog("magnolia"));
       Iterator<Dog> i3 =l.iterator();
       while(i3.hasNext()){
       		Dog d2=i3.next();
       		System.out.println(d2.name);
       }
       System.out.println("size : "+l.size());
       System.out.println("get 1 :"+l.get(1).name);
       System.out.println("index of aiko is :"+l.indexOf(d));
       l.remove(2);
       Object[] oa=l.toArray();
       for(Object o:oa){
       	Dog d2=(Dog)o;
       	System.out.println("oa  "+ d2.name);
       }
       
      
   }
}

class Dog{
	public String name;
	public Dog(String n){
		name=n;
	}
}