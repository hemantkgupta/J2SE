class A extends Thread {
  private static B b = new B();
  private String s1;
  public void run() {System.out.print(b.m1(s1));}
  A(String threadName, String s1) {
    super(threadName); this.s1 = s1;
  }
  public static void main (String[] args) {
    A a = new A("T1","A"), b = new A("T2","B"); a.start(); b.start();
}}
class B {
  private String s1;
  public synchronized String m1(String s) {
    s1 = s;
    try {Thread.sleep(1);} catch (InterruptedException ie) {}
    return "["+Thread.currentThread().getName()+","+s1+"]";
}}


