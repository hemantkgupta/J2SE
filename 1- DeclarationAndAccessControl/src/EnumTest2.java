public class EnumTest2 {
    public static void main(String[] args) {
    	CoffeeSize1 x=CoffeeSize1.HUGE;
    	CoffeeSize1 y=CoffeeSize1.OVERHELMING;
        System.out.println("Outside class enum with constructor :"+x.getOunce());
        System.out.println("Outside class enum with constructor :"+y.getLidCode());
    }
}

enum  CoffeeSize1{
	//private int ounce;
	BIG(4),HUGE(8),
	OVERHELMING(16){
		public String getLidCode(){
			return "A";
		} 
	};
	CoffeeSize1( int size){
		ounce=size;		
	}
	private int ounce;
	public int getOunce(){
		return ounce;
	}
	public String getLidCode(){
		return "B";
	}
}
