package Collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_demo {
	//Indexed access(get elements only index)
	//Allows duplicates
	//maintains insertion order
	//supports null elements
	//Faster than ArrayList
	//Allocate more memory as compare to ArrayList (store data(current) and Pointers for next) 
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		Object list1=new LinkedList<String>();
		list1=list.clone();
		list.add(0,"Apple");
		list.add(1, "Mango");
		list.add(2,"Kiwi");
		list.add(3,"Banana");// String
		list.add(4,"Banana");
//		//System.out.println(list.);
//		System.out.println(list.get(3));
//		
//		list.set(2, "Orange");// replace current element
//		System.out.println(list);
//		list.add(3, "Kiwi");//add element on particular index
//		System.out.println(list);
//		System.out.println(list.contains("Banana"));
//		System.out.println(list.equals("Banana"));//false
//	    System.out.println(list.getFirst());
//	    System.out.println(list.getLast());
//	    System.out.println(list.indexOf("Kiwi"));
//	    System.out.println(list.isEmpty());
//	    list.remove(0);
//	    System.out.println(list);
//	    list.remove("Kiwi");
//	    System.out.println(list);
//	    System.out.println(list.reversed());
	    System.out.println("Original LinkedList="+list);
	    System.out.println("Clone LinkedList="+list.clone());
//	    for(String ch:list)
//	    {
//	    	System.out.println(ch);
//	    }
//		//Using iterator
//	    Iterator<String> itr=list.iterator();
//	    while(itr.hasNext())
//	    {
//	    	System.out.println(itr.next());
//	    }

	}

}
//Write a program to:
//•	Create a LinkedList of numbers.
//•	Clone it using the clone() method.
//•	Display both original and cloned lists.
//
//8. Convert LinkedList to ArrayList
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Convert it into an ArrayList.
//•	Display both the LinkedList and ArrayList.


