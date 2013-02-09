class JSC202 {
  static byte m1() {final short s1 = 127; return s1;}  // 1 
  
  static byte m2(final short s2) {return (byte)s2;} // 2 needed return (byte)s2
  
  public static void main(String[] args) {
    short s3 = 4;
    System.out.print(""+m1()+m2(s3));                // 3
}}


