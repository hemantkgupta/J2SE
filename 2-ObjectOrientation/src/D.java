class A2 {}  
class B2 extends A2 {}
class C2 extends B2 {}
class D {
  void m1(A2 a) {System.out.print("A");}
  void m1(B2 b) {System.out.print("B");}
  void m1(C2 c) {System.out.print("C");}
  public static void main(String[] args) {
    A2 c1 = new C2();
    B2 c2 = new C2();
    C2 c3 = new C2();
    D d1 = new D();
    d1.m1(c1); d1.m1(c2); d1.m1(c3);
}}

