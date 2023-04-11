package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// Hashmap
		//here we store data or value in key value pair.
		//we can not from index
		Map map= new HashMap();
		
		map.put("username", "AKASH");
		map.put("Pass", "Harshu");
		map.put("ID", 101);
		map.put("roll_no", 1);
		map.put("address", "Bhavani pet");
		
		System.out.println(map);
		System.out.println(map.get("username"));
		System.out.println(map.get("Pass"));
	}

}
