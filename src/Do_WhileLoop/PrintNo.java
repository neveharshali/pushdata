package Do_WhileLoop;

public class PrintNo {

	public static void main(String[] args) {
	  // print 1 to 50 no.
		System.out.println("Sequence of 1 to 50");
		int a=1;
		do {
			System.out.println(a);
			a++;
		}while(a<=50);
    
		// print 50 to 1 no.
				System.out.println("Reverse of 50 to 1");
				int b=50;
				do {
					System.out.println(b);
					b--;
				}while(b>=1);
	}

}
