class A extends Thread {
 public A(Runnable r) {super(r);}
 // public void run() {System.out.print("A");}
}
class B implements Runnable {
  public void run() {System.out.print("B");}
}
class C {
  public static void main(String[] args) {
    new A(new B()).start();
}}

