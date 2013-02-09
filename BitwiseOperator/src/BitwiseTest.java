
public class BitwiseTest {
	public static void main(String[] args){
		 int bitmask = 0x000F;
		  int valu = 0x2222;
		  System.out.println(valu & bitmask);  // prints "2"
		  System.out.println(9 & 7);
		  
		  String l = Integer.toBinaryString(4);
		  System.out.println(l);
		  String l_shift = Integer.toBinaryString(4<<2);
		  System.out.println(l_shift);
		  
		  String pr = Integer.toBinaryString(16);
		  System.out.println(pr);
		  String pr_shift = Integer.toBinaryString(16>>2);
		  System.out.println(pr_shift);
		  
		  String nr = Integer.toBinaryString(-16);
		  System.out.println(nr);
		  String nr_shift = Integer.toBinaryString(-16>>2);
		  System.out.println("Negative right: "+nr_shift);
		  
		  String ur = Integer.toBinaryString(-16);
		  System.out.println(ur);
		  String ur_shift = Integer.toBinaryString(-16>>>2);
		  System.out.println("Unsigned right: "+ur_shift);
		  
		  // 11111111 11111111 11111111 11111111 >>> 24 ==
		  // 00000000 00000000 00000000 00000000

			  int ss = -1;
			  ss = ss >>> 23;
			  System.out.println(ss);
		  
		  //11101101 << 2 == 10110100

		  byte val = (byte)0xed;
		  byte val_shift = (byte)(val<<2);
		  String a = Integer.toBinaryString(256 + val);
          System.out.println(a);
          //String a = Integer.toBinaryString(256 + (int) val);
		 //System.out.println(a.substring(a.length() -8));
		  
          String b = Integer.toBinaryString(256 + val_shift);
          System.out.println(b);
		  //String b = Integer.toBinaryString(256 + (int) val_shift);
		  //System.out.println(b.substring(b.length() -8));
	}

}
