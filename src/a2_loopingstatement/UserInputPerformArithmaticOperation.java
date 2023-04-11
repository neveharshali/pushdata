package a2_loopingstatement;

import java.util.Scanner;

public class UserInputPerformArithmaticOperation {

	public static void main(String[] args) {
		//W.A.P take user input on perform arithmatic operation.
		System.out.println("Enter 1st No");
		Scanner x= new Scanner(System.in);
		int a=x.nextInt();
		System.out.println("Enter 2nd No");
		int b=x.nextInt();
		
		System.out.println("ADDITION");
		System.out.println(a+b);
		
		System.out.println("SUBTRACTION");
		System.out.println(a-b);
		
		System.out.println("MULTIPLICATION");
		System.out.println(a*b);
		
		System.out.println("DIVISION");
		System.out.println(a/b);

	}

}
