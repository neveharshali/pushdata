package keywords;
class A1{
	// super keyword refer to parent class instance variable.
	int a;
}

public class Super_1 extends A1 {
	public void m1(int a) {
		super.a=a;
		System.out.println(a);
		
	}
     
	public static void main(String[] args) {
		Super_1 x= new Super_1();
		x.m1(10);

	}

}
