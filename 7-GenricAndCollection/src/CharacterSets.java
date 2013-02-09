import java.util.*;

public class CharacterSets {
    public static void main(String[] args) {
        int numArgs = args.length;

        // A set keeping track of all characters previously encountered.
        Set encountered = new HashSet();                              // (1)
        // For each program argument in the command line ...
        for (int i=0; i<numArgs; i++) {

            // Convert the current argument to a set of characters.
            String argument = args[i];
            Set characters = new HashSet();                           // (2)
            int size = argument.length();
            // For each character in the argument...
            for (int j=0; j<size; j++)
                // add character to the characters set.
                characters.add((argument.charAt(j)));    // (3)

            // Determine whether a common subset exists.                 (4)
            Set commonSubset = new HashSet(encountered);
            commonSubset.retainAll(characters);
            boolean areDisjunct = commonSubset.size()==0;

            if (areDisjunct)
                System.out.println(characters + " and " + encountered +
                    " are disjunct.");
            else {
                // Determine superset and subset relations.              (5)
                boolean isSubset = encountered.containsAll(characters);
                boolean isSuperset = characters.containsAll(encountered);
                if (isSubset && isSuperset)
                    System.out.println(characters + " is equivalent to " +
                        encountered);
                else if (isSubset)
                    System.out.println(characters + " is a subset of " +
                        encountered);
                else if (isSuperset)
                    System.out.println(characters + " is a superset of " +
                        encountered);
                else
                    System.out.println(characters + " and " +
                        encountered + " have " + commonSubset + " in common.");
            }

            // Update the set of characters encountered so far.
            encountered.addAll(characters);                           // (6)
        }
        Collection intList = new ArrayList();
        int[] values = { 9, 11, -4, 1, 13, 99, 1, 0 };
        for (int i = 0; i < values.length; i++)
             intList.add((values[i]));

        System.out.println("Before: " + intList);  
        Set s=new HashSet(intList);
        System.out.println("Hashset " + s); 
        encountered.addAll(s);
        System.out.println("Hashset " + encountered);
    }
}

