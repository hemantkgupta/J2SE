import java.util.*;

class Dog1{
	private String name;
	public Dog1(String n){
		name=n;
	}
	public String toString(){
		return name;
	}
	
	public boolean equals(Object o){
		if((o instanceof Dog1)&& ((Dog1)o).name==name){
			return true;
		}else{return false ;}
	}	
	public int hashCode(){
		return name.length();
	}
}
class Cat{}

enum Pets{ DOG,CAT,HORSE}

public class TestHashMap {
   public static void main(String[] args) {
		Map<Object ,Object> m=new HashMap<Object ,Object>();
		m.put("k1",new Dog1("aiko"));
		m.put("k2",Pets.DOG);
		m.put(Pets.CAT,"CAT KEY");
		Dog1 d1=new Dog1("Clover");
		m.put(d1,"Dog1 Key");
		m.put(new Cat(),"Cat Key");
		System.out.println(m.get("k1"));
		String k2="k2";
		System.out.println(m.get(k2));
		Pets p=Pets.CAT;
		System.out.println(m.get(p));
		System.out.println(m.get(d1));
		System.out.println(m.get(new Cat()));
		System.out.println(m.size());
			
        
    }
}
