package a1_ConditionalStatement;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		//System.out.println("Enter the character");
		//Scanner sc= new Scanner(System.in);
		//char ch=sc.next().charAt(;)
		char ch='A';
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='u' || ch=='o'||ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Vowel");
		}
		else {
			System.out.println("consonant");
		}

	}

}
