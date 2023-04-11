package practiceBasis;

import java.util.Scanner;

public class FibboSeries {

	public static void main(String[] args) {
		System.out.println("enter term");
		Scanner sc= new Scanner(System.in);
		int d=sc.nextInt();
		int a=3,b=4,c;
		for(int i=1;i<=d;i++) {
			System.out.print(a+" ");
			c=a+b;//0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,5+8=13
			//System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		

	}

}
