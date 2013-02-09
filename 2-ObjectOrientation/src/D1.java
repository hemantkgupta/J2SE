class A3 {void m1(A3 A3) {System.out.println("A3");}}
class B3 extends A3 {void m1(B3 b) {System.out.println("B");}}
class C3 extends B3 {void m1(C3 c) {System.out.println("C");}}

class D1 extends C3 {
  void m1(D1 d1) {System.out.println("D");}		
  public static void main(String[] Strings) {
  	
  	A3 A3=new A3();
  	B3 b=new B3();
  	C3 c = new C3();
  	D1 d=new D1();
  	
    d.m1(A3);d.m1(b);d.m1(c);d.m1(d);
    
    A3 a31=new C3();
    
    d.m1(a31);
    
    a31.m1(A3);
    a31.m1(b);
    a31.m1(c);
    
}}