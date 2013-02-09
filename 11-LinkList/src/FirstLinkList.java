
public class FirstLinkList {
	
	public static void main(String[] args){
		
		MyNode other = new MyNode(7,null);
		MyNode start = new MyNode(5,other);
		start = insertFirst(start, new MyNode(3,null));
		start = insertInOrder(start, new MyNode(1, null));
		display(start);
		start = insertInOrder(start, new MyNode(0, null));
		//start = deleteFirst(start);
		display(start);
		start = insertInOrder(start, new MyNode(4, null));
		display(start);
		start = insertInOrder(start, new MyNode(10, null));
		display(start);
	}
	public static void display(MyNode start){
		MyNode p = start;
		while(p!=null){
			System.out.println("Data is " + p.data);
			p=p.next;
		}
	}
	public static MyNode insertFirst(MyNode start, MyNode append){
		append.next = start;		
		return append;		
	}
	public static MyNode deleteFirst(MyNode start){
		/*if(start.next==null)
			return null;*/
		start = start.next;		
		return start;		
	}
	public static MyNode insertInOrder(MyNode start, MyNode insert){
		if (insert.data <= start.data){
			return insertFirst(start, insert);
		}
		else{
			MyNode prev = start;
			MyNode temp =start.next;
			while( temp!= null && temp.data < insert.data ){				
				prev = temp;
				temp = temp.next;								
			}				
			if(temp!= null ){
				insert.next = temp;
				prev.next = insert;						
			}
			else{
				prev.next = insert;
			}
			return start;
		}			
	}
}
class MyNode {
	public int data;
	public MyNode next;
	public MyNode(int data, MyNode MyNode){
		this.data=data;
		this.next=MyNode;
		
	}

}

