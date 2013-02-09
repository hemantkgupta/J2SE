import java.util.*;

public class WeightGroups2 {
    public static void main(String[] args) {

        // Create a map to store the frequency for each group.
        Map groupFreqData = new HashMap();

        int numArgs = args.length;
        for (int i=0; i<numArgs; i++) {
            // Get the value from argument and group into intervals of 5    (1)
            double weight = Double.parseDouble(args[i]);
            Integer weightGroup = new Integer((int) Math.round(weight/5)*5);
            // Increment count, set to 1 if it's the first value of group.  (2)
            Integer oldCount = (Integer) groupFreqData.get(weightGroup);
            Integer newCount = (oldCount==null) ?
                new Integer(1) :
                new Integer(oldCount.intValue()+1);
            groupFreqData.put(weightGroup, newCount);                    // (3)
        }

        /* Only the histogram for the weight groups between 50 and 150
           is of interest. Print frequency for these groups in a sorted order. */

        // Transfer the data to a sorted map.
        SortedMap sortedGroupFreqData = new TreeMap(groupFreqData);      // (4)

        // Select the relevant sub-map.
        SortedMap selectedGroupFreqData =                                // (5)
                sortedGroupFreqData.subMap(new Integer(50), new Integer(150));

        /** Print by traversing the sorted entries of weight groups (key)
            and count (value). */
        Iterator entryIterator =
                selectedGroupFreqData.entrySet().iterator();             // (6)
        while (entryIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) entryIterator.next();          // (7)

            // Extract groups (key) and count (value) from entry.           (8)
            Integer group = (Integer) entry.getKey();
            Integer count = (Integer) entry.getValue();
            int intCount = count.intValue();

            /* Use the fill() method from the Arrays class to create a
               string consisting of intCount number of '*'. */
            char[] bar = new char[intCount];
            Arrays.fill(bar, '*');                                       // (9)

            System.out.println(group + ":\t" + new String(bar));
        } // end while
    } // end main()
} // end of class