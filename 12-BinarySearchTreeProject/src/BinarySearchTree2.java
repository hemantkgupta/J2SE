class Node
   {
   public int iData;              // data item (key)
   public Node leftChild;         // this node's left child
   public Node rightChild;        // this node's right child
   public Node parent;
   public void displayNode()      // display ourself
      {
      System.out.print('{');
      System.out.print(iData);
      System.out.print("} ");
      }
   }  // end class Node
public class BinarySearchTree2 {
	 public static void main(String[] args){
		 
		 Node root = null;
		
		 
		 Node aNode = new Node();
		 aNode.iData = 20;
		 aNode.leftChild = null;
		 aNode.rightChild = null;
		 aNode.parent = null;
		 root = insertNode(root, aNode);		 
		 System.out.println(root.iData);
		 
		 Node bNode = new Node();
		 bNode.iData = 15;
		 bNode.leftChild = null;
		 bNode.rightChild = null;
		 bNode.parent = null;
		 root = insertNode(root, bNode);
		 System.out.println(root.leftChild.iData);
		 
		 Node cNode = new Node();
		 cNode.iData = 25;
		 cNode.leftChild = null;
		 cNode.rightChild = null;
		 cNode.parent = null;
		 root = insertNode(root, cNode);
		 System.out.println(root.rightChild.iData);
		 inorder(root);
		 Node suc = successorNode(root.leftChild);
		 suc.displayNode();
		 
	 }
	 public static Node insertNode(Node root, Node insert){
		 
		 Node y =null;
		 Node x = root;
		 while(x!=null){
			 y=x;
			 if(insert.iData < x.iData){
				 x = x.leftChild;
			 }else{
				 x = x.rightChild;
			 }
		 }		 
		// System.out.println(y);
		 insert.parent = y;
		 
		 if (y == null){
			 root = insert;
		 }else if(insert.iData < y.iData){
			 y.leftChild = insert;
		 }else{
			 y.rightChild = insert;
		 }
		return root;
	 }
	 
	 public static void inorder(Node root){
		 
		 if(root!= null){
			 inorder(root.leftChild);
			 root.displayNode();
			 inorder(root.rightChild);
		 }
	 }
	 
	 public static Node successorNode(Node x){
		 if(x.rightChild != null){
			 return minimum(x.rightChild);
		 }
		 Node y  = x.parent;
		 while(y!= null && x == y.rightChild){
			 x=y;
			 y=y.parent;
		 }
		 return y;
	 }
	public static Node minimum(Node root)      // find node with given key
	      {
		    
	     while(root.leftChild != null){
	    	 root = root.leftChild;
	     }
	                               
	            return root;
	                           
	      }  

}
