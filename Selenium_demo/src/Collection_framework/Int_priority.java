package Collection_framework;

import java.util.PriorityQueue;

public class Int_priority {

	public static void main(String[] args) {
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		q.add(2);
		q.add(6);
		q.add(0);
		q.add(9);
		
		q.add(3);
		q.poll();
		q.poll();
		
		System.out.println(q);

	}

}
