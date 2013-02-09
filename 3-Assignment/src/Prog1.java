/**
 * @(#)Prog1.java
 *
 *
 * @author 
 * @version 1.00 2007/1/19
 */

public class Prog1 {
    
    public static void main(String[] args) {
    int i=1;
    int k=++i + i++ + i; 
     System.out.println(k);
      byte b=(byte)128;
    int j=b;
     System.out.println(j);
      //  int [] a  ={4,8,16};
        //int l=1;
        //a[++l]=l--;
        //System.out.println(a[0]+a[1]+a[2]);
        i = 0;
        int[] a = {3,6};
        a[i] = i = 9;
        System.out.println(i + " " + a[0] + " " + a[1]);

    }
}
