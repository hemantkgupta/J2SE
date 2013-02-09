
class High{
	public  static String donr(int... x){
		return "High";
	}
}
public class Low extends High{
	public  static String donr(Integer x,Integer y){
		return "Low";
	}
    
    public static void main(String[] args) {
        System.out.println(donr(21));
        System.out.println(donr(21,23));
    }
}
