package a2_loopingstatement;

import java.util.Scanner;

public class AreaOfSqaure {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter legth");
		int a=x.nextInt();
		System.out.println("Enter breath");
		int b=x.nextInt();
		int area=a*b;
		System.out.println("Area of Sqaure");
		System.out.println(area);

	}

}
