
public class TestStringCreation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte[] bytes = {2, 4, 6, 8};

    	char[] characters = {'a', 'b', 'C', 'D'};

    	StringBuffer strBuffer = new StringBuffer("abcde");

//    	Examples of Creation of Strings

    	String byteStr = new String(bytes);     // will not work 

    	String charStr = new String(characters); 

    	String buffStr = new String(strBuffer);

    	System.out.println("byteStr : "+byteStr);

    	System.out.println("charStr : "+charStr);

    	System.out.println("buffStr : "+buffStr);

	}

}
