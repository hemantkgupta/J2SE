enum CoffeeSize {
	// the arguments after the enum value are "passed"
    // as values to the constructor
     BIG(8), HUGE(10), OVERWHELMING(16); 
     
     // constructor 
     CoffeeSize(int ounces) {
       this.ounces = ounces; // assign the value to an instance variable
     }
     
    // an instance variable each enum value has 
    private int ounces;      // an instance variable each enum value has
   
    // a method
    public int getOunces() {
      return ounces;
    }
}

public class Coffee {
   CoffeeSize size;    // each instance of Coffee has-a CoffeeSize enum
                      
   public static void main(String[] args) {
      Coffee drink1 = new Coffee();
      drink1.size = CoffeeSize.BIG;

      Coffee drink2 = new Coffee();
      drink2.size = CoffeeSize. OVERWHELMING;

      System.out.println(drink1.size.getOunces()); // prints 8
      System.out.println(drink2.size. getOunces()); // prints 16
   }
}

