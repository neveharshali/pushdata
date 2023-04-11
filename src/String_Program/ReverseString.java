package String_Program;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse_String
		
		System.out.println("Enter The word");
		System.out.print("Original Word: ");
		Scanner B= new Scanner(System.in);
		String A=B.next().toString();
      // String A= "SHINCHAN";
       //System.out.println(A.length());
       
       System.out.print("Reverse Word:");
       for(int i=A.length()-1;i>=0;i--) {
    	   
    	   System.out.print(A.charAt(i));
       }
	}

}
