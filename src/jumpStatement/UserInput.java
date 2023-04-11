package jumpStatement;

import java.util.Scanner;

class UserInput {

	public static void main(String[] args) {
		System.out.println("Enter Character");
		Scanner c= new Scanner(System.in);
		char a=c.next().charAt(0);
		
		System.out.println(a);
		
		System.out.println("Enter Name");
		String b=c.next().toString();
		
		System.out.println(b);

	}

}
