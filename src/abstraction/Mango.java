package abstraction;

public class Mango extends Fruit{
	public void taste() {
		System.out.println("Taste is sour");
	}

	public static void main(String[] args) {
		Apple a= new Apple();
		a.taste();//Taste is sweet
		a.m1();//i am m1
		Mango b= new Mango();
		b.taste();//taste is sour
		b.m1();

	}

}
