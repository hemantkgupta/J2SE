class MWC102 {
  static char c;	
  public static void main (String[] args) {
    byte[] a = new byte[1]; 
    long[] b = new long[1];
    float[] cc = new float[1];
    Object[] d = new Object[1];
    System.out.println(a[0]+","+b[0]+","+cc[0]+","+d[0]);
    System.out.println(Integer.toOctalString(Byte.MAX_VALUE)+",");
    int x=c;
    System.out.println("here x is"+x);
    char aa='\u0099';
    char ab='\u0098';
    System.out.print(aa+ab);	
}}

