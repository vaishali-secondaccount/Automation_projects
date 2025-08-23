package Collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_creation {

	public static void main(String[] args) {
		//Add Group of elements with List interface method "of" 
		ArrayList<Integer> list=new ArrayList<>(List.of(50,70,80,40,50));
		Collections.sort(list);
		System.out.println(list);

	}

}
// create ArrayList and search for an element
//Convert ArrayList to Array
//Merge two ArrayList and remove duplicate elements 
