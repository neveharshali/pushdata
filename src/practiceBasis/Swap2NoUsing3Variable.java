package practiceBasis;

import java.util.Scanner;

public class Swap2NoUsing3Variable {

	public static void main(String[] args) {
	int x,y,z;//swap x and y
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value of x and y");
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("Before Swapping no: " +x +" " +y);
	//swapping logic
	z=x;//z=10//z=50
	x=y;//x=20//x=30
	y=z;//y=10//y=50
	System.out.println("After Swapping: " +x +" " +y);
	

	}

}
