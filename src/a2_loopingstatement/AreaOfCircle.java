package a2_loopingstatement;

import java.util.Scanner;



public class AreaOfCircle  {

	public static void main(String[] args) {
		//W.A.P to find area of circle and user take rad. 
		int rad;
		System.out.println("Enter Radius");
		Scanner c= new Scanner(System.in);
		rad=c.nextInt();
		float pi=(float) 3.14;
		double area=2*pi*rad;
		System.out.println(area);
	
        
	}

}
