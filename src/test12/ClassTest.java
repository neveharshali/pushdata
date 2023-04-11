package test12;

public class ClassTest {

		//1.collection of variable & methods i.e called class
        //2.we can declare static & non_static member.
		//3.we can access static member--->classname.staticMemberName
		//4.we can access Non_static member--->we need to create object of class-->refvar.non_staticMember
		//5.object creation syntax-->classNm refvar=new classNm();
		
		int a=100;//Non_static / instance variable
		int b=200;
		static int e=500;//static variable
		public void run() {//non_static method
			int c=a+b;
			System.out.println("Addition is=" +c);
			System.out.println("Hello Everyone");
		}
		public static void show() {//static method
			System.out.println("I am static method");
		}
		
		public void mul(int f, int g)//nonstatic method
		{
			int h=f*g;
			System.out.println("Multiplication is=" +h);
			
		}
		
			public static void main(String[] args) {
				//non_static member call
				ClassTest d = new ClassTest();
				d.run();//300 and hello Everyone 
				System.out.println(d.a);//100
				System.out.println(d.b);//200
				d.mul(10, 5);//50
				
				//static member call
				System.out.println(ClassTest.e);//500--staticvariable call
				ClassTest.show();//i am static method---static_method call
				
		
		
	}

}
