class ToplevelClass { 
	public static int i=4;                                          // (1)
    private String headlines = "Shine the inner light";         // (2)
    public NonStaticMemberClass makeInstance() {                // (3)
        return new NonStaticMemberClass();                      // (4)
    }
    public class NonStaticMemberClass {                         // (5) NSMC
    //  static int sf = 2003; 				// (6) Not OK.
    	int j=i;                                  
        final static int fsf = 2003;                            // (7) OK.
        private String banner;                                  // (8)
        public NonStaticMemberClass() { banner = headlines; }   // (9)
        public void print(String prefix) {
            System.out.println(prefix + banner + " in " + fsf);}// (10)
    }
}

public class Client {                                           // (11)
    public static void main(String[] args) {                    // (12)
        ToplevelClass topRef = new ToplevelClass();             // (13)
        ToplevelClass.NonStaticMemberClass innerRef1 =
                      topRef.makeInstance();                    // (14)
        innerRef1.print("innerRef1: ");                         // (15)
    //  ToplevelClass.NonStaticMemberClass innerRef2 =
    //                new ToplevelClass.NonStaticMemberClass(); // (16) Not OK.
        ToplevelClass.NonStaticMemberClass innerRef3 =
                     topRef.new NonStaticMemberClass();         // (17)
        innerRef3.print("innerRef3: ");                         // (18)
    }
}

