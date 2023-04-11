package keywords;

public class A2this {
   //used to call current class method
	public void m1() {
		System.out.println("i am m1");
		this.m2(10);
		
	}
	public void m2(int a) {
		System.out.println("i am m2");
		System.out.println(a);
	}
	public static void main(String[] args) {
		A2this x=new A2this();
		x.m1();

	}

}
