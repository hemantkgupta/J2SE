import java.util.*;
public class TestIterator {
   public static void main(String[] args) {
       List<Dog2> l=new ArrayList<Dog2>();
       Dog2 d=new Dog2("aiko");
       l.add(d);
       l.add(new Dog2("clover"));
       l.add(new Dog2("magnolia"));
       Iterator<Dog2> i3 =l.iterator();
       while(i3.hasNext()){
       		Dog2 d2=i3.next(); // Casting is not needed. First Element will be accessed by saying next
       		System.out.println(d2.name);
       }
       System.out.println("size : "+l.size());
       System.out.println("get 1 :"+l.get(1).name);
       System.out.println("index of aiko is :"+l.indexOf(d));
       l.remove(2);
       Object[] oa=l.toArray();
       for(Object o:oa){
       	Dog2 d2=(Dog2)o;
       	System.out.println("oa  "+ d2.name);
       }
       
      
   }
}

class Dog2{
	public String name;
	public Dog2(String n){
		name=n;
	}
}