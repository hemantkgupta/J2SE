import java.util.*;

public class WeightGroups {
    public static void main(String[] args) {

        // Create a map to store the frequency for each group.
        Map groupFreqData = new HashMap();

        int numArgs = args.length;
        for (int i=0; i<numArgs; i++) {
            // Get the value from an argument and group into intervals of 5.(1)
            double weight = Double.parseDouble(args[i]);
            Integer weightGroup = new Integer((int) Math.round(weight/5)*5);
            // Increment count, set to 1 if it's the first value of group.  (2)
            Integer oldCount = (Integer) groupFreqData.get(weightGroup);
            Integer newCount = (oldCount==null) ?
                new Integer(1) :
                new Integer(oldCount.intValue()+1);
            groupFreqData.put(weightGroup, newCount);                    // (3)
        }
        /* Print by traversing a sorted list of groups (keys),
           and extracting count (values) from the groupFreqData map. */

        /* Create a list of groups (keys), and use the sort algorithm from
           the Collections class to sort the keys. */
        List keys = new ArrayList(groupFreqData.keySet());               // (4)
        Collections.sort(keys);                                          // (5)

        /* Create an iterator on the sorted keys. Traverse the keys,
           looking up the frequency from the frequency map. */
        ListIterator keyIterator = keys.listIterator();                  // (6)
        while (keyIterator.hasNext()) {
            // Current key (group).                                         (7)
            Integer group = (Integer) keyIterator.next();
            // Extract count (value) from the map.
            Integer count = (Integer) groupFreqData.get(group);          // (8)
            int intCount = count.intValue();

            /* Use the fill() method from the Arrays class to create a
               string consisting of intCount number of '*'. */
            char[] bar = new char[intCount];
            Arrays.fill(bar, '*');                                       // (9)

            System.out.println(group + ":\t" + new String(bar));
        } // end while
    } // end main()
} // end of class

