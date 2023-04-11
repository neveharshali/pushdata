package practiceBasis;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		System.out.println("Enter any no");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		//int a=7;
		int b=0;
		for(int i=2;i<=a-1;i++)
		{
			if(a%i==0)//91%2=1=fail
			{
				b=b+1;
			}
		}
		if(b==0) {
			System.out.println("prime_no");
		}else {
			System.out.println("not_prime");
		}

	}

}
