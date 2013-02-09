public class EqualsTest {
    public static void main(String[] args) {
        Moof one=new Moof(3);
        Moof two=new Moof(4);
        if(one.equals(two)){
        	System.out.println("one and two are equal");
        }else{
        	System.out.println("Not equal");
        }
    }
}
class Moof{
	private int moofValue;
	public Moof(int value){
		moofValue=value;
		
	}
	public int getMoofValue(){
		return moofValue;
	}
	public boolean equals(Object o){
		if((o instanceof Moof)&& ((Moof)o).getMoofValue()==moofValue){
			return true;
		}else{
			return false;
		}
	}
		
}
