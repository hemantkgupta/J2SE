
public class TestStringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// compareTo
		String string1 = "apple";
		System.out.println(string1.compareTo("zebra"));   // -1
		System.out.println(string1.compareTo("apple"));   // 0
		System.out.println(string1.compareTo("appld"));   // +1
		
		// charAt
		String string2 = "hello";
		char b = string2.charAt(0);  // b is 'h'
		char c = string2.charAt(4);  // c is 'o'
		System.out.println(b);
		System.out.println(c);
		
		// getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		// Copies characters from this string into the destination character array.
		String str1 = "My name is bob";
		char str2[] = new char[str1.length()];
		str1.getChars(0, str1.length(), str2, 0);
		System.out.print("The String str2 is : ");
		for (char chr : str2) {
			System.out.print(chr);
		}
		
		// concat
		String str3 = "bob";
		String str4 = "cob";
		System.out.println("\nstr3.concat(str4): " + str3.concat(str4));
		
		// substring
		String string3 = "hemant gupta";
		String d = string3.substring(0);  // d is "hemant"
		String e = string3.substring(3);  // e is "ant"
		String sub7_12 = string3.substring(7, 12);
		System.out.println(d);
		System.out.println(e);
		System.out.println(sub7_12);
		
		// indexOf
		String string4 = "Here there everywhere";

		int f = string4.indexOf("there");  // a is 5
		int g = string4.indexOf("er");     // b is 1
		int h = string4.indexOf("eR");     // c is -1, "eR" is not found
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		// trim
		String str7temp = "  \t\n Now for some Search and Replace Examples    ";
		String str7 = str7temp.trim();
		System.out.println(str7);
		
		// other indexOf
		System.out.println("Index of for in- " + str7 + " : "+ str7.indexOf("for"));
		System.out.println("str7.indexOf(for, 30) : "+ str7.indexOf("for", 30));
		System.out.println("str7.indexOf('p', 30) : "+ str7.indexOf('p', 30));
		System.out.println("str7.lastIndexOf('p') : "+ str7.lastIndexOf('p'));
		
		
		
	}

}
