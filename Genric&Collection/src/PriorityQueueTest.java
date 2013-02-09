import java.util.PriorityQueue;


public class PriorityQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = {">ff<", "> f<", ">f <", ">FF<" }; // ordered?
		PriorityQueue<String> pq3 = new PriorityQueue<String>();
		for(String s : sa)
		  pq3.offer(s);
		for(String s : sa)
		  System.out.print(pq3.poll() + ", ");

	}

}
