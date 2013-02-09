
public class NoInHexaForm {
	public static void main(String[]args){
		{     
		int z=0;
		int i=1,v=0,s=0,b=0;
		int m=0;
		int[] ar =new int[20];;
		int num=14;
		if(num>=16)
		{	while(num>=16)
			{	z=num/16;
				b=num%16; // got digit
				num=z;
				ar[m]=b;  // save digit in array
				m++;
			}
			ar[m]=z; // save last remainder in array to get last digit
			s=m;
			System.out.println("\nIt's hex form is  ");
			while(s>=0)
			{		if (ar[s]==15)
					System.out.print("F");
			    	else{
				      if(ar[s]==14)
					  System.out.print("E");
					  else{
					    if (ar[s]==13)
						System.out.print("D");
						else{
							if (ar[s]==12)
							System.out.print("C");
							else{
								if (ar[s]==11)
								System.out.print("B");
							    else{
								if (ar[s]==10)
								System.out.print("A");
								else
								System.out.print(ar[s]);
							    }
							}
						 }
					  }
				   }
				   s--;
		    }
		}
		else
		System.out.println("\nIt's hex form is "+num);
		

		}

	}

}
