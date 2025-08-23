package MAp_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hash_map {
	//Increasing order for String Alphabetical order
	//No duplicate elements allowed it will override value for that key
	//null not allowed (Even single null not allowed)
	//elements stored on the basis of Key

	public static void main(String[] args) {
		TreeMap<String,String> map=new TreeMap<String,String>();
		map.put("One","Orange" );
		map.put("Four", "Mango");
		map.put("Three", "Banana");
		map.put("Five", "Watermelon");
		map.put("Ten", "Muskmelon");
		map.put("Two", "Kiwi");
		map.put("Nine", "Kiwi");
//		map.put(null, "Nothing");
//		map.put(null, null);
		map.put("Nine", "CusturdApple");// replace
		System.out.println(map);
		System.out.println(map.get("Three"));
		
		
		System.out.println(map);
		map.replace("Nine", "CusturdApple");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.ceilingKey("Nines"));
		System.out.println(map.floorKey("Nines"));
		System.out.println(map.higherKey("Nines"));
		System.out.println(map.lowerKey("Nines"));
		System.out.println(map.getOrDefault("Nine", "CusturdApple"));
		

	}

}
