package test12;

public class Operators {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		System.out.println("a=20");
		System.out.println("b=10");
		
		//Arithmatic operators-->+,-,*,/,%
		System.out.println("ARITHMATIC OPERATORS");
		System.out.println(a+b);//30
		System.out.println( a-b);//10
		System.out.println(a*b);//200
		System.out.println(a/b);//2
		System.out.println(a%b);//0
		//Relational operators--> >,<,>=,<=,==,!=
		System.out.println("RELATIONAL OPERATORS");
		System.out.println(a>b);//T
		System.out.println(a<b);//F
		System.out.println(a>=b);//T
		System.out.println(a<=b);//F
		System.out.println(a==b);//F
		System.out.println(a!=b);//T
		//Logical Operator- &&(and),||(or),!(Not)
		//&&(and)
		System.out.println("LOGICAL AND(&&)");
		System.out.println(a>b && a>=b);//T&&T=T
		System.out.println(a>b && a<b);//T&&F=F
		System.out.println(a<b && a>b);//F&&T=F
		System.out.println(a==b && a<b);//F&&F=F
		//||(or)
		System.out.println("LOGICAL OR(||)");
		System.out.println(a>b || a>=b);//T||T=T
		System.out.println(a!=b || a==b);//T||F=T
		System.out.println(a<b || a>b);//F||T=T
		System.out.println(a<b || a==b);//F||F=F
		//!(Not)
		System.out.println("LOGICAL NOT(!)");
		System.out.println(!(a>b));//!(T)=F
		System.out.println(!(a==b));//!(F)=T
		
		
	}

}
