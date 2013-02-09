

////////////////////////////////////////////////////////////////
class LinkList
   {
   private Node first;            // ref to first link on list

// -------------------------------------------------------------
   public LinkList()              // constructor
      {
      first = null;               // no links on list yet
      }
// -------------------------------------------------------------
   public boolean isEmpty()       // true if list is empty
      {
      return (first==null);
      }
// -------------------------------------------------------------
                                  // insert at start of list
   public void insertFirst(int id)
      {                           // make new link
      Node newNode = new Node(id);
      newNode.next = first;       // newLink --> old first
      first = newNode;            // first --> newLink
      }
// -------------------------------------------------------------
   public Node deleteFirst()      // delete first item
      {                           // (assumes list not empty)
      Node temp = first;          // save reference to link
      first = first.next;         // delete it: first-->old next
      return temp;                // return deleted link
      }
// -------------------------------------------------------------
   public void displayList()
      {
      System.out.print("List (first-->last): ");
      Node current = first;       // start at beginning of list
      while(current != null)      // until end of list,
         {
         current.displayNode();   // print data
         current = current.next;  // move to next link
         }
      System.out.println("");
      }
// -------------------------------------------------------------
   public Node find(int key)      // find link with given key
   {   
   // Check if list is empty 	   
   if(first==null) return null;	   
   Node current = first;              // start at 'first'
   while(current.iData != key)        // while no match,
      {
      if(current.next == null)        // if end of list,
         return null;                 // didn't find it
      else                            // not end of list,
         current = current.next;      // go to next link
      }
   return current;                    // found it
   }
// -------------------------------------------------------------
   public Node delete(int key)    // delete link with given key
      {  
	   
	   // Check if list is empty 	   
	   if(first==null) return null;	
	   
      Node current = first;              // search for link
      Node previous = first;
      
      
      while(current.iData != key)
         {
         if(current.next == null)
            return null;                 // didn't find it
         else
            {
            previous = current;          // go to next link
            current = current.next;
            }
         }                               // found it
      if(current == first)               // if first link,
         first = first.next;             //    change first
      else                               // otherwise,
         previous.next = current.next;   //    bypass it
      return current;
      }   
// -------------------------------------------------------------
   public void insert(int key)        // insert, in order
      {
      Node newLink = new Node(key);    // make new link
      Node previous = null;            // start at first
      Node current = first;
      // Will add duplicate value
      while(current != null && key > current.iData)
         {                             // or key > current,
         previous = current;
         current = current.next;       // go to next item
         }
      if(previous==null)               // at beginning of list
         first = newLink;              // first --> newLink
      else                             // not at beginning
         previous.next = newLink;      // old prev --> newLink
      newLink.next = current;          // newLink --> old currnt
      }  // end insert()
// -------------------------------------------------------------
   
   }  // end class LinkList
////////////////////////////////////////////////////////////////
public class LinkListProg
   {
   public static void main(String[] args)
      {
      LinkList theList = new LinkList();  // make new list

      theList.insert(34);
      theList.insert(44);
      theList.insert(12);
      theList.insert(243);
      theList.insert(354);
      theList.insert(3);
      theList.insert(4);
      theList.insert(13);
      theList.insert(39);
      theList.insert(66);
      //able to add duplicate values
      theList.insert(13);
      
      theList.displayList();              // display list

                    // display list
      }  // end main()
   }  // end class LinkListApp
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
class Node
   {
   public int iData;              // data item
   public Node next;              // next link in list
// -------------------------------------------------------------
   public Node(int id) // constructor
      {
      iData = id;                 // initialize data
         // ('next' is automatically
      }                           //  set to null)
// -------------------------------------------------------------
   public void displayNode()      // display ourself
      {
      System.out.print("{" + iData  + "} ");
      }
   }  // end class Link
