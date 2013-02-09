class T {
  private int i1, i2;
  void printI1I2() {System.out.print("T, i1="+i1+", i2="+i2);}
  T(int i1, int i2) {this.i1=i1; this.i2=i2;}
  T(){};
}
class U extends T {
  private int i1, i2;
  void printI1I2() {System.out.print("U, i1="+i1+", i2="+i2);}
  U(int i1, int i2) {this.i1=i1; this.i2=i2;}
  public static void main(String[] args) {
    T t = new U(1,2); t.printI1I2();
}}

