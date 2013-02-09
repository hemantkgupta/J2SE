import java.util.*;

public class TakeAGuess {
    final static int NUM_DIGITS = 5;

    public static void main(String[] args) {

        // Sanity check on the given data.
        if (args.length != NUM_DIGITS) {
            System.err.println("Guess " + NUM_DIGITS + " digits.");
            return;
        }
        /* Initialize the solution list. This program has a fixed solution. */
        List secretSolution = new ArrayList();                      // (1)
        secretSolution.add("5");
        secretSolution.add("3");
        secretSolution.add("2");
        secretSolution.add("7");
        secretSolution.add("2");

        // Convert the user's guess from string array to list.         (2)
        List guess = new ArrayList();
        for (int i=0; i<NUM_DIGITS; i++)
            guess.add(args[i]);

        // Find the number of digits that were correctly included.     (3)
        List duplicate = new ArrayList(secretSolution);
        int numIncluded = 0;
        for (int i=0; i<NUM_DIGITS; i++)
            if (duplicate.remove(guess.get(i))) numIncluded++;

        /* Find the number of correctly placed digits by comparing the two
           lists, element by element, counting each correct placement. */
        // Need two iterators to traverse through guess and solution.  (4)
        ListIterator correct = secretSolution.listIterator();
        ListIterator attempt = guess.listIterator();
        int numPlaced = 0;
        while (correct.hasNext())
            if (correct.next().equals(attempt.next())) numPlaced++;

        // Print the results.
        System.out.println(numIncluded + " digit(s) correctly included.");
        System.out.println(numPlaced +   " digit(s) correctly placed.");
    }
}