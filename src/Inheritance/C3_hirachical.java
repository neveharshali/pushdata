package Inheritance;

public class C3_hirachical extends C1_hirachical {
	public void m3() {
		System.out.println("I am child_2 class");
	}

	public static void main(String[] args) {
		C3_hirachical a= new C3_hirachical();
		a.m1();
		a.m3();

	}

}
