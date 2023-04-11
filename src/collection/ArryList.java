package collection;

import java.util.ArrayList;
import java.util.List;

public class ArryList {

	public static void main(String[] args) {
		// ArrayList
		//1.allow duplicate value
		//2.we can handle by index
		List list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add("Harshu");
		list.add('A');
		list.add(30);
		
		System.out.println(list);
		 list.remove(2);
		System.out.println(list.get(2));//Harshu
		System.out.println(list.contains(10));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list.isEmpty());

	}

}
