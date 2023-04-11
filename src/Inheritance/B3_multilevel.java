package Inheritance;

public class B3_multilevel extends B2_multilevel{
	public void m3() {
		System.out.println("I am child class");
	}

	public static void main(String[] args) {
		B3_multilevel a= new B3_multilevel();
		a.m1();
		a.m2();
		a.m3();

	}

}
