import java.util.*;

public class IteratorUsage {
    public static void main(String[] args) {

        // (1) Create a list of Integers.
        Collection intList = new ArrayList();
        int[] values = { 9, 11, -4, 1, 13, 99, 1, 0 };
        for (int i = 0; i < values.length; i++)
             intList.add((values[i]));

        System.out.println("Before: " + intList);         // (2)
		Integer[] ar=new Integer[8];
		intList.toArray(ar);
		for(int o:ar){
			System.out.print(" "+o);
		}
        Iterator<Integer> interator = intList.iterator();          // (3) Get an iterator.
        while (interator.hasNext()) {                     // (4) Loop
            Integer element = interator.next(); // (5) The next element no need to cast in java5
            int value = element.intValue();
            if (value < 1 || value > 10) // (6) Remove the element if
                interator.remove();      //     its value is not between 1 and 10.
        }

        System.out.println("\n After:  " + intList);    // (7)
    }
}

