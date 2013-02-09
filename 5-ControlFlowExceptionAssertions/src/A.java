class A {
  public static void main (String[] args) {
    Object error = new Error();
    Object runtimeException = new RuntimeException();
    System.out.print((error instanceof Exception) + ","); // Error is not Exception
    System.out.print(runtimeException instanceof Exception);
}}

