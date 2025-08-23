package Collection_framework;
//Deque follows FIFO order 
//duplicate elements allowed
//null not allowed
//elements stored on the basis of hash code value
import java.util.ArrayDeque;

public class ArrayDeque_demo {

	public static void main(String[] args) {
		ArrayDeque<String> q=new ArrayDeque<String>();
		q.add("Apple");
		
		q.add("Watermelon");
		q.add("Banana");
		q.add("Kiwi");
		q.add("Mango");
		
		
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		
		System.out.println(q);
		q.offerFirst("MuskMelon");
		q.offerLast("Orange");
		System.out.println(q);
		System.out.println(q.peek());
		q.poll();
		
		System.out.println(q);
		
		

	}

}
