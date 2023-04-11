package a2_loopingstatement;



public class PrimeNo {

	public static void main(String[] args) {
	   // check 7 no is prime or not                                                    
		int a=8;
		int count=0;
		for(int i=2;i<=a-1;i++) {
			if(a%2==0)
			{
				count=count+1;
			}
		}
		if(count==0)
		{
			System.out.println("It is a Prime_no");
		}else {
			System.out.println("It is Non_PrimeNo");
		}

	}

}
