public class Test {
    
    public static void main(String[] args) {
        int x=1;
         A b=new A(x){void donothing(){}};
    }
}
class A{
	A(int z){
		System.out.println("Hi"+z);
	}
	void donothing(){
	}
}