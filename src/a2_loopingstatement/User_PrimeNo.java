package a2_loopingstatement;

import java.util.Scanner;

public class User_PrimeNo {

	public static void main(String[] args) {
		//W.A.P user input is prime or not
		int b=0;
		System.out.println("Enter No");
		Scanner c= new Scanner(System.in);
		int n=c.nextInt();//n=27
		for(int a=2;a<=n-1;a++) {
			
			if(n%a==0)//47%2=1=fail=prime//26%2=0=true=non_prime
			{
				b=b+1;
			}
			
		}
		if(b==0)
		{
			System.out.println("prime no");
		}
		else
			System.out.println("not prime no");

	}

}
