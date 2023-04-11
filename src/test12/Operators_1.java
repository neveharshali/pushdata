package test12;

public class Operators_1 {

	public static void main(String[] args) {
		int a=10;
		//increment-->a++[post_Increment]
		             //&++[Pre_Increment]
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(++a);//12
		
		//decrement-->a--[Post_Decrement]
					//&--a[Pre_Decrement]
		
		System.out.println(a--);//12
		System.out.println(a);//11
		System.out.println(--a);//10
		
		for(int i=1;i<5;i++) {
			System.out.println(i);
		}
			
	}

}
