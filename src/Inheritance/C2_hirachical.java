package Inheritance;

public class C2_hirachical extends C1_hirachical {
	public void m2() {
		System.out.println("I am child_1 class");
	}

	public static void main(String[] args) {
		 C2_hirachical a = new  C2_hirachical();
		 a.m1();
		 a.m2();

	}

}
