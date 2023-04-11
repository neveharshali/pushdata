package a2_loopingstatement;

public class Odd_No {
	//print odd no 100 to 200
	public void sequnce() {
		System.out.println("ODD_NO");
		for(int a=100;a<=200;a++) {
			if(a%2!=0) {
				System.out.println(a);
			}
		}
		
	}
	//print reverse odd no 200 to 100
	public void reverse() {
		System.out.println("REVERSE_ODD_NO");
		for(int b=200;b>=100;b--) {
			if(b%2!=0) {
				System.out.println(b);
			}
		}
		
	}
	public static void main(String[] args) {
		Odd_No c= new Odd_No();
		c.sequnce();
		c.reverse();

	}

}
