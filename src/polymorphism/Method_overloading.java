package polymorphism;

public class Method_overloading {
	public void login(String name, int pass) {
		System.out.println("Navigated to home page");
	}
	public void login( int pass,String name) {
		System.out.println("Navigated to login page");
	}
	public static void main(String[] args) {
		Method_overloading a= new Method_overloading();
		a.login("Harshu", 123);
		a.login(123, "Harshu");
	

	}

}
