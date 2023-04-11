package whileloop;

public class OddNo {

	public static void main(String[] args) {
	// print odd no 50 to 100.
		System.out.println("Sequence of odd_no 50 to 100");
		int a=50;
		while(a<=100)
		{
			if(a%2!=0) {
			System.out.println(a);
			}
			a++;
		}
		// print odd no 100 to 50.
				System.out.println("Reverse of odd_no 100 to 50");
				int b=100;
				while(b>=50)
				{
					if(b%2!=0) {
					System.out.println(b);
					}
					b--;
				}


	}

}
