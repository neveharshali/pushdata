package practiceBasis;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		System.out.println("Enter Any No");
		Scanner a= new Scanner(System.in);
		  int no=a.nextInt();
		  int rev=0;
		  while(no!=0) {
			  int rem=no%10;
			  rev=rev*10+rem;
			  no=no/10;
		  }
		  System.out.println("The reverse of the given number is: " + rev); 
	}

}
