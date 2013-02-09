public class GenricTest {
    public static void main(String[] args) {
        Gen b=new Gen();
        int x=b.aMethod(7);
        System.out.println("Gentest"+x);
    }
}

 class Gen {
	public <T> T aMethod(T a){
		return a;
	}
} 