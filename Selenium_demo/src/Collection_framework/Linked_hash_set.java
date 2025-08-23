package Collection_framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

//linked hash set follows insertion order 
//No duplicate elements allowed
//store null(Only one null allowed)
//elements stored on the basis of hash code value
public class Linked_hash_set {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("MAggi");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");
		set.add("Water");
		set.add("Water");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		
		System.out.println(set.isEmpty());
		System.out.println("First element="+set.getFirst());
		System.out.println("Last element="+set.getLast());
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
