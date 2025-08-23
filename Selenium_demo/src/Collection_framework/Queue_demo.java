package Collection_framework;
//Queue follows FIFO order 
//duplicate elements allowed
//null not allowed
//elements stored on the basis of hash code value
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<String>();
		q.add("Apple");//1
		q.add("Mango");
		q.add("Banana");
		q.add("Watermelon");
		q.add("Kiwi");
		q.add("CusturdApple");
		System.out.println(q);
		q.poll();// remove apple
		System.out.println(q);
		q.poll();// remove banana
		
		System.out.println(q);
		q.poll();
		System.out.println(q);
//		System.out.println(q.element());
//		q.offer("Banana");
//		System.out.println(q);
//		System.out.println(q.peek());
//		//q.clear();
//		q.poll();
//		System.out.println(q);
//		q.remove();
//		System.out.println(q);
//		q.remove("Kiwi");
//		
//		System.out.println(q);
//		
		
		

	}

}
