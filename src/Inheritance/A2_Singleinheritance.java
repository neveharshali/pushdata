package Inheritance;

public class A2_Singleinheritance extends A1_singleinheritance {
	public void m2() {
		System.out.println("I am child class");
	}

	public static void main(String[] args) {
		A2_Singleinheritance a= new A2_Singleinheritance();
		a.m1();
		a.m2();

	}

}
