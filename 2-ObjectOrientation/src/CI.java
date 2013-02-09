interface I {
	String s1 = "I";
	int x=2;
	}
class AI implements I {
	String s1 = "A";
	//x=3;
	}
class BI extends AI {String s1 = "B";}
class CI extends BI {
  String s1 = "C";
  void printIt() {
    System.out.print(((AI)this).s1 + ((BI)this).s1 +
                     ((CI)this).s1 + ((I)this).s1);
  }
  public static void main (String[] args) {new CI().printIt();}
}

