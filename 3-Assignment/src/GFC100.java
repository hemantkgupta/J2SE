class GFC100 {
  public static void main(String[] args) {
    final short s1 = 200; // 1
    final char c1 = 200;  // 2
   // byte b1 = s1;       // 3 short to byte nedd explicit cast
   // byte b2 = c1;       // 4 byte range exceeded
    byte b3 = 1;        // 5
   // byte b4 = 1L;       // 6
   // byte b5 = 1.0;      // 7
   // byte b6 = 1.0d;     // 8
}}

