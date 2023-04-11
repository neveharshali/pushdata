package keywords;

public class This1 {
	//used to invoke current class constructor
	
	This1() {
		this(10);
		System.out.println("hiii");
		
	}
	
	This1(int b){
		System.out.println("hello");
		System.out.println(b);
	}
	public static void main(String[] args) {
		This1 a= new This1();
		
		
	}

}
