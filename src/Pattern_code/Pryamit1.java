package Pattern_code;

import java.util.Scanner;

public class Pryamit1 {

	public static void main(String[] args) {
		//Priyamit
		System.out.println("Enter the no");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
