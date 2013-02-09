class GFC102 {
  private static int x=1;
  void m1(int i) {x++; i++;}
  public static void main (String[] args) {
  	
    int y=3; 
    new GFC102().m1(y);	
    System.out.println(x + "," + y);
}}

