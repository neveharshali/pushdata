package Do_WhileLoop;

public class EvenNO1 {

	public static void main(String[] args) {
		// print even no 50 to 100
		System.out.println("Sequence of even_no");
		int a=50;
		do {
			System.out.println(a);
			a=a+2;
		}while(a<=100);
 
		// print even no 100 to 50
		System.out.println("Reverse of Evenno");
				int b=100;
				do {
					System.out.println(b);
					b=b-2;
				}while(b>=50);

	}

}
