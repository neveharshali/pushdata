package keywords;
class C1{
	//using super keyword parent constructor method call
	C1() {
		System.out.println("I am parent class constructor");
	}
}

public class Super_3 extends C1 {
	Super_3(){
		
		System.out.println("I am current class method");
	}

	public static void main(String[] args) {
		Super_3 a= new Super_3();

	}

}
