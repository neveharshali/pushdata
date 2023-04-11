package keywords;
class c{
	//used to call parent class method
	public void m1() {
		System.out.println("I am parent class method");
	}
}

public class Super_2 extends c {
	public void m2() {
		super.m1();
		System.out.println("Iam current class method");
	}

	public static void main(String[] args) {
		Super_2 x= new Super_2();
		x.m2();

	}

}
