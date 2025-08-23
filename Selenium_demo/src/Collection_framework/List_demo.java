package Collection_framework;
import java.util.*;
//Indexed access(get elements only index)
//Allows duplicates
//maintains insertion order
//supports null elements


public class List_demo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add(0,"Apple");
		list.add(1, "Mango");
		list.add(2,"Kiwi");
		list.add(3,"Banana");// String
		System.out.println(list);
//		System.out.println(list.get(3));
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
//	    for(String ch:list)
//	    {
//	    	System.out.println(ch);
//	    }
		//Using iterator
	    Iterator<String> itr=list.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    // Using ListIterator
	    Iterator<String> itrs=list.listIterator();
	    while(itrs.hasNext())
	    {
	    	System.out.println(itrs.next());
	    }
		
	
	}

}
