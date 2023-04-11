package polymorphism;

public class Method_overriding2 extends Method_overriding1  {
	public void display() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Method_overriding2 c= new Method_overriding2();
		c.display();
		

	}

}
