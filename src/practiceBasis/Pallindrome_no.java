package practiceBasis;

import java.util.Scanner;

public class Pallindrome_no {

	public static void main(String[] args) {
		
			/*System.out.println("Enter Any No");
			Scanner a= new Scanner(System.in);
			  int no=a.nextInt();*/
			  
		      int no=151;
		      int z=no;
			  int rev=0;
			  while(no!=0) {
				  int rem=no%10;
				  rev=rev*10+rem;//1---15----151
				  no=no/10;
			  }
			  if(z==rev) {
				  System.out.println("Palindrome_No");
			  }
			  else {
				  System.out.println("Not_Pallindrome_no");
			  }
			  
		}

	}


