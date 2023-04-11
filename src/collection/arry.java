package collection;

import java.util.ArrayList;
import java.util.List;

public class arry {

	public static void main(String[] args) {
		// arralist: duplicate value allow and refer index by
		
		List a= new ArrayList();
		
		a.add(10);//0
		a.add(20);
		a.add(30);//1
		a.add(10);//2
		a.add("Harshu");//3
		a.add('A');
		a.remove(1);
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		System.out.println(a);
		System.out.println(a.contains('A'));
		System.out.println(a.contains(50));
		

	}

}
