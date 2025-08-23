package Collection_framework;

import java.util.TreeSet;

public class Int_tree_set {

	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(1);
		set.add(5);
		set.add(8);
		set.add(0);
		System.out.println(set);
		System.out.println(set.ceiling(5));
		System.out.println(set.floor(9));
	}

}
