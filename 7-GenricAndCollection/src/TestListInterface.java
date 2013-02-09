import java.util.*;
public class TestListInterface {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(1, "3");
        List list2 = new LinkedList(list);
        list.addAll(list2);
        list2 = list.subList(2, 5);
        list2.clear();
        System.out.println(list);
    }
}

