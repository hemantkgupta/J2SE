import java.util.*;

public class Sets {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        addRange(set1, 1);
        ArrayList list1 = new ArrayList();
        addRange(list1, 2);
        TreeSet set2 = new TreeSet();
        addRange(set2, 3);
        LinkedList list2 = new LinkedList();
        addRange(list2, 5);

        set1.removeAll(list1);
        list1.addAll(set2);
        list2.addAll(list1);
        set1.removeAll(list2);

        System.out.println(set1);
    }
    static void addRange(Collection col, int step) {
        for (int i = step*2; i<=25; i+=step)
            col.add(new Integer(i));
    }
}
