package practiceBasis;

import java.util.Scanner;

public class Swapping2nowirhout3rdvariable {

	public static void main(String[] args) {
		System.out.println("Enter the value a & b");
		Scanner c=new Scanner(System.in);
		int a=c.nextInt();
		int b=c.nextInt();
		System.out.println("Before Swapping: " +a +" " +b);
		//swapping logic
		a=a+b;//50+20=70//a=20+30=50
		b=a-b;//70-20=50//b=50-30=20
		a=a-b;//70-50=20//a=50-20=30
		System.out.println("After Swapping: " +a +" " +b);

	}

}
