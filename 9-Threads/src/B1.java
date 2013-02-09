class A extends Thread {
  String[] sa;
  public A(String[] sa) {this.sa = sa;}
  public void run() {
   // synchronized (sa) 
    	System.out.print(sa[0] + sa[1] + sa[2]);
}}
class B1 {
  private static String[] sa = new String[]{"X","Y","Z"};
  public static void main (String[] args) {
   // synchronized (B1.class) {
      Thread t1 = new A(sa);
      t1.start();
      try{
      	Thread.sleep(5);
      }catch(Exception e){}
      sa[0] = "A"; sa[1] = "B"; sa[2] = "C";
}}

