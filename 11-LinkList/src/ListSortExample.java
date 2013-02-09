public class ListSortExample 
  { 
    static class Node 
      { int val; Node next; 
        Node(int v, Node t) { val = v; next = t; } 
      } 
    static Node create() 
      { Node a = new Node(0, null); 
        for (int i=15;i>1;i-- ){ 
          a.next = new Node(i, a.next); 
        }
        return a; 
      } 
    static Node sort(Node a) 
      { Node t, u, x, b = new Node(0, null); 
        while (a.next != null) 
          { 
            t = a.next; u = t.next; a.next = u; 
            for (x = b; x.next != null; x = x.next) 
              if (x.next.val > t.val) break; 
            t.next = x.next; x.next = t; 
          } 
        return b; 
      } 
    static Node reverse(Node x) 
    { Node t, y = x, r = null; 
      while (y != null) 
        { t = y.next; y.next = r; r = y; y = t; } 
      return r; 
    } 
    static void print(Node h) 
      { for (Node t = h.next; t != null; t = t.next) 
          System.out.println(t.val + ""); } 
    public static void main(String[] args) 
      { print(reverse(sort(create()))); } 
  } 

