
public class SecondHighestNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,0,-1,8,26,1,26};
		int high, secHigh, temp, i;

		high = secHigh = arr[0];

		for (i = 1; i < arr.length; ++i)
		{
		temp = arr[i];
		if(temp > high)
		{
		secHigh = high;
		high = temp;
		}
		else if(temp >secHigh && temp != high)
		{
		secHigh = temp;
		}
		}
		System.out.println(secHigh);
	}

}
