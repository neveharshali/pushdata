package a1_Access_modifier;

public class AACC {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c;
		//System.out.println("before swapping");
		 
		//a=a+b;
		//b=a-b;
		//a=a-b;
		c=a+b;
		a=c-a;
		b=c-a;
		
		
		
		System.out.println("after swapping"+a+ " " +b);
		
		

	}

}
