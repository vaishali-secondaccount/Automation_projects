package Collection_framework;

import java.util.*;

public class Vector_practice {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		v.add("Orange");
		v.add("Blue");
		v.add("White");
		v.add("Black");
		v.add(4, "Gray");
		v.add(null);
		v.add("Black");
		System.out.println(v);
		System.out.println(v.indexOf("Black"));
		System.out.println(v.subList(0, 3));
	
		

	}

}
