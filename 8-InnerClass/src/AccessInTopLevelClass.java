public class AccessInTopLevelClass {                            // (1)
	
    public void nonStaticMethod_1() {                           // (2)
        System.out.println("nonstaticMethod_1 in AccessInTopLevelClass");
    }

    private static class StaticMemberClass_1 {                  // (3)
        private static int i;                                   // (4)
        private int j;                                          // (5)
		
        public static void staticMethod_1_1() {                 // (6)
            System.out.println("staticMethod_1_1 in StaticMemberClass_1");
        }

        interface StaticMemberInterface_1_1 { int Y2K = 2000; } // (7)

        protected static class StaticMemberClass_1_1
                implements StaticMemberInterface_1_1 {          // (8)

            private int k = Y2K;                                // (9)
            public void nonStaticMethod_1_1_1() {               // (10)
            //  int jj = j;              // (11) Not OK.
                int ii = i;              // (12)
                int kk = k;              // (13)

            //  nonStaticMethod_1();     // (14) Not OK.
                staticMethod_1_1();      // (15)
            }

            public static void main (String[] args) {
                int ii = i;              // (16)
            //  int kk = k;              // (17) Not OK.
                staticMethod_1_1();      // (18)
            }
        }
    }
}
