package String_Program;

import java.util.Scanner;

public class PracticeBasis {

	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner s= new Scanner(System.in);
		String s1=s.next().toString();
		int b=s1.length();
		String s2="";
		
		
		
		for(int i=b-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		
		System.out.println(s2);
	}

}
