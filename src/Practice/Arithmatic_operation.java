package Practice;

import java.util.Scanner;

public class Arithmatic_operation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st no");
		int P=sc.nextInt();
		System.out.println("Enter 2nd no");
		int Q=sc.nextInt();
		
		int R=P+Q;
		System.out.println("Addition=>" +R);
		
		int S=P*Q;
		System.out.println("Multiplication=>" +S);
		
		int T=P-Q;
		System.out.println("Subtraction=>" +T);
		
		int U=P/Q;
		System.out.println("Division=>" +U);
		
		int V=P%Q;
		System.out.println("Reminder=>" +V);

	}

}
