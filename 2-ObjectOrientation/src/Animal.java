public class Animal {
    
    static String name1="Hemant ";
    
    String name;
    String name2="Hello ";
    Animal(String name){
    	this.name=name;
    }
    public Animal() {
    	this(name1);
    	name=name2+name+giveName();
    	
    }
    public String giveName(){
    	return "kumar";
    }
    public static void main(String[] args) {
    	
        Animal a=new Animal();
        System.out.println("First: "+a.name);
        
        Animal b=new Animal("Gupta");
        System.out.println(b.name);
    }
}
