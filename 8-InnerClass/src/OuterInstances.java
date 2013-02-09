//OuterInstances.java
 class TLClass {                                               // (1) TLC
    private String id = "TLClass object ";                    // (2)
    public TLClass(String objId) { id = id + objId; }         // (3)
    public void printId() {                                   // (4)
        System.out.println(id);
    }

    class InnerB {                                            // (5) NSMC
        private String id = "InnerB object ";                 // (6)
        public InnerB(String objId) { id = id + objId; }      // (7)
        public void printId() {                               // (8)
            System.out.print(TLClass.this.id + " : ");        // (9)
            System.out.println(id);                           // (10)
        }

        class InnerC {                                        // (11) NSMC
            private String id = "InnerC object ";             // (12)
            public InnerC(String objId) { id = id + objId; }  // (13)
            public void printId() {                           // (14)
                System.out.print(TLClass.this.id + " : ");    // (15)
                System.out.print(InnerB.this.id + " : ");     // (16)
                System.out.println(id);                       // (17)
            }
            public void printIndividualIds() {                // (18)
                TLClass.this.printId();                       // (19)
                InnerB.this.printId();                        // (20)
                this.printId();                                    // (21)
            }
        }
    }
}
public class OuterInstances {                                       // (22)
    public static void main(String[] args) {                        // (23)
        TLClass a = new TLClass("a");                               // (24)
        TLClass.InnerB b = a.new InnerB("b");                       // (25)
        b.printId();                                                // (26)
        TLClass.InnerB.InnerC c = b.new InnerC("c");                // (27)
        c.printId();                                                // (28)
        TLClass.InnerB.InnerC d = b.new InnerC("d");                // (29)
        d.printId();                                                // (30)
        TLClass.InnerB bb = new TLClass("aa").new InnerB("bb");     // (31)
        bb.printId();                                               // (32)
        TLClass.InnerB.InnerC cc = bb.new InnerC("cc");             // (33)
        cc.printId();                                               // (34)
        TLClass.InnerB.InnerC ccc =
            new TLClass("aaa").new InnerB("bbb").new InnerC("ccc"); // (35)
        ccc.printId();                                              // (36)
        System.out.println("------------");
        ccc.printIndividualIds();                                   // (37)
    }
}
