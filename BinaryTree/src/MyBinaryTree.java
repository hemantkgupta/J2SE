import java.io.*;
import java.util.*;               // for Stack class
////////////////////////////////////////////////////////////////
class Node
   {
   public int iData;              // data item (key)
   public Node leftChild;         // this node's left child
   public Node rightChild;        // this node's right child

   public void displayNode()      // display ourself
      {
      System.out.print('{');
      System.out.print(iData);
      System.out.print("} ");
      }
   }  // end class Node
////////////////////////////////////////////////////////////////
class Tree
   {
   private Node root;             // first node of tree

// -------------------------------------------------------------
   public Tree()                  // constructor
      { root = null; }            // no nodes in tree yet
// -------------------------------------------------------------
   public Node find(int key)      // find node with given key
      {
	  //Check if tree is empty 
	  if(root == null) return null;
	  
      Node current = root;               // start at root
      while(current.iData != key)        // while no match,
         {
         if(key < current.iData)         // go left?
            current = current.leftChild;
         else                            // or go right?
            current = current.rightChild;
         if(current == null)             // if no child,
            return null;                 // didn't find it
         }
      return current;                    // found it
      }  // end find()
// -------------------------------------------------------------
   public void insert(int id)
      {
      Node newNode = new Node();    // make new node
      newNode.iData = id;           // insert data
      // If tree is empty
      if(root==null)                // no node in root
         root = newNode;
      else                          // root occupied
         {
         Node current = root;       // start at root
         Node parent;
         while(true)                // (exits internally)
            {
            parent = current;
            if(id < current.iData)  // go left?
               {
               current = current.leftChild;
               if(current == null)  // if end of the line,
                  {                 // insert on left
                  parent.leftChild = newNode;
                  return;
                  }
               }  // end if go left
            else                    // or go right?
               {
               current = current.rightChild;
               if(current == null)  // if end of the line
                  {                 // insert on right
                  parent.rightChild = newNode;
                  return;
                  }
               }  // end else go right
            }  // end while
         }  // end else not root
      }  // end insert()
// -------------------------------------------------------------
   public boolean delete(int key) // delete node with given key
      {                           // (assumes non-empty list)
      Node current = root;
      Node parent = root;
      boolean isLeftChild = true;
      
      // while loop to search the node
      while(current.iData != key)       
         {
         parent = current;
         if(key < current.iData)         // go left?
            {
            isLeftChild = true;
            current = current.leftChild;
            }
         else                            // or go right?
            {
            isLeftChild = false;
            current = current.rightChild;
            }
         if(current == null)             // end of the line,
            return false;                // didn't find it
      }  // end while
           
      // if no children, simply delete it
      if(current.leftChild==null && current.rightChild==null)
         {
         if(current == root)             // if tree is empty
            root = null;                 
         else if(isLeftChild)
            parent.leftChild = null;     // disconnect from parent - node is deleted
         else                           
            parent.rightChild = null;
         }

      // if no right child, replace with left subtree
      else if(current.rightChild==null)
         if(current == root)
            root = current.leftChild;
         else if(isLeftChild)
            parent.leftChild = current.leftChild;
         else
            parent.rightChild = current.leftChild;

      // if no left child, replace with right subtree
      else if(current.leftChild==null)
         if(current == root)
            root = current.rightChild;
         else if(isLeftChild)
            parent.leftChild = current.rightChild;
         else
            parent.rightChild = current.rightChild;

      else  // two children, so replace with inorder successor
         {
         // get successor of node to delete (current)
         Node successor = getMySuccessor(current);

         // connect parent of current to successor instead
         if(current == root)
            root = successor;
         else if(isLeftChild)
            parent.leftChild = successor;
         else
            parent.rightChild = successor;

         // connect successor to current's left child
         successor.leftChild = current.leftChild;
         }  // end else two children
      // (successor cannot have a left child)
      return true;                                // success
      }  // end delete()
// -------------------------------------------------------------
   // returns node with next-highest value after delNode
   // goes to right child, then right child's left descendents
   private Node getSuccessor(Node delNode)
      {
      Node successorParent = delNode;
      Node successor = delNode;
      Node current = delNode.rightChild;   // go to right child
      while(current != null)               // until no more
         {                                 // left children,
         successorParent = successor;
         successor = current;
         current = current.leftChild;      // go to left child
         }
       // if successor is not right child of the node to be deleted
       // make connections
      if(successor != delNode.rightChild)  // 
         {                                 // make connections
         successorParent.leftChild = successor.rightChild;
         successor.rightChild = delNode.rightChild;
         }
      return successor;
      }
// -------------------------------------------------------------
   // returns node with next-highest value after delNode
   // goes to right child, then right child's left descendents
   private Node getMySuccessor(Node delNode)
      {
      Node successorParent = delNode;
      Node successor = delNode.rightChild;
      
      while(successor.leftChild != null)               // until no more
         {                                 // left children,
         successorParent = successor;
         successor = successor.leftChild ;    // go to left child
         }
       // if successor is not right child of the node to be deleted
       // make connections
      if(successor != delNode.rightChild)  // 
         {                                 // make connections
         successorParent.leftChild = successor.rightChild;
         successor.rightChild = delNode.rightChild;
         }
      return successor;
      }
// -------------------------------------------------------------
   public void traverse(int traverseType)
      {
      switch(traverseType)
         {
         case 1: System.out.print("\nPreorder traversal: ");
                 preOrder(root);
                 break;
         case 2: System.out.print("\nInorder traversal:  ");
                 inOrder(root);
                 break;
         case 3: System.out.print("\nPostorder traversal: ");
                 postOrder(root);
                 break;
         }
      System.out.println();
      }
// -------------------------------------------------------------
   private void preOrder(Node root2)
      {
      if(root2 != null)
         {
         System.out.print(root2.iData + " ");
         preOrder(root2.leftChild);
         preOrder(root2.rightChild);
         }
      }
// -------------------------------------------------------------
   private void inOrder(Node root2)
      {
      if(root2 != null)
         {
         inOrder(root2.leftChild);
         System.out.print(root2.iData + " ");
         inOrder(root2.rightChild);
         }
      }
// -------------------------------------------------------------
   private void postOrder(Node root2)
      {
      if(root2 != null)
         {
         postOrder(root2.leftChild);
         postOrder(root2.rightChild);
         System.out.print(root2.iData + " ");
         }
      }
// -------------------------------------------------------------
   public void displayTree()
      {
      Stack globalStack = new Stack();
      globalStack.push(root);
      int nBlanks = 32;
      boolean isRowEmpty = false;
      System.out.println(
      "......................................................");
      while(isRowEmpty==false)
         {
         Stack localStack = new Stack();
         isRowEmpty = true;

         for(int j=0; j<nBlanks; j++)
            System.out.print(' ');

         while(globalStack.isEmpty()==false)
            {
            Node temp = (Node)globalStack.pop();
            if(temp != null)
               {
               System.out.print(temp.iData);
               localStack.push(temp.leftChild);
               localStack.push(temp.rightChild);

               if(temp.leftChild != null ||
                                   temp.rightChild != null)
                  isRowEmpty = false;
               }
            else
               {
               System.out.print("--");
               localStack.push(null);
               localStack.push(null);
               }
            for(int j=0; j<nBlanks*2-2; j++)
               System.out.print(' ');
            }  // end while globalStack not empty
         System.out.println();
         nBlanks /= 2;
         while(localStack.isEmpty()==false)
            globalStack.push( localStack.pop() );
         }  // end while isRowEmpty is false
      System.out.println(
      "......................................................");
      }  // end displayTree()
// -------------------------------------------------------------
   }  // end class Tree
////////////////////////////////////////////////////////////////
class MyBinaryTree
{
   public static void main(String[] args) throws IOException
      {
      int value;
      Tree theTree = new Tree();

      theTree.insert(50);
      theTree.insert(25);
      theTree.insert(15);
      theTree.insert(35);
      theTree.insert(5);
      theTree.insert(20);
      theTree.insert(30);
      theTree.insert(32);
      theTree.insert(40);
//      theTree.insert(87);
//      theTree.insert(93);
//      theTree.insert(97);

      theTree.displayTree();
         
//      theTree.insert(33);
//      Node found = theTree.find(87);
//               if(found != null)
//                  {
//                  System.out.print("Found: ");
//                  found.displayNode();
//                  System.out.print("\n");
//                  }
//               else
//                  System.out.print("Could not find ");
                 
               
               boolean didDelete = theTree.delete(25);
               if(didDelete){
                  System.out.print("Deleted "  + '\n');
                  theTree.displayTree();
               }
               
                
//               theTree.traverse(1);
//               theTree.traverse(2);
//               theTree.traverse(3);
               
           
      }  // end main()

// -------------------------------------------------------------
   }  // end class TreeApp
////////////////////////////////////////////////////////////////
