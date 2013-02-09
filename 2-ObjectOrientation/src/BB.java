abstract class AA {
  private int x = 4, y = 2;
  public int x() {return x;}
  public void x(int x) {this.x = x;}
  public int y() {return y;}
  public void y(int y) {this.y = y;}
  public abstract int math();
  AA(int m,int p){x=m;y=p;
  }
}
public class BB {
  static AA a1 = new AA(2,1) {
    //public A(int i1, int i2) {
    //	x(i1);y(i2);//};
    public int math() {return x()+y();}
  };
  public static void main(String[] args) {
    System.out.print(a1.math());
}}


