import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerialTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Dog d = new Dog("bulldog",40);
			
			oos.writeObject(d);
			oos.close();
			
			FileInputStream fis = new FileInputStream("test.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d1 = (Dog)ois.readObject();
			System.out.println(d1.getName());
			ois.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}

class Dog implements Serializable{
	String name;
	int weight;
	Dog(String n, int w){
		name=n;
		weight=w;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}