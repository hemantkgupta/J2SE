import java.util.*;
public class TestListIterator {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("A"); 
        l.add("B"); 
        l.add("C"); 
        l.add("D"); 
        l.add("E");
        ListIterator i = l.listIterator();
        i.next(); i.next(); i.next(); i.next();
        i.remove();
        i.previous(); i.previous();
        i.remove();
        System.out.println(l);
    }
}


