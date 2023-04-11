package collection;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// Hashset
		//1.not allow duplicate value
		//2.we can not handle by index
		Set set= new HashSet();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add("Akash");
		set.add('H');
		set.add(30);
		
		System.out.println(set);
		set.remove(30);
		System.out.println(set);
		System.out.println(set.contains(30));
		System.out.println(set.getClass());
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set.isEmpty());
	}

}
