package keywords;

public class AAthis {
	//this keyword refer to current class instance variable
	int a;
	int d=20;
	int c= a+d;
	String name;
	public void m1(String name,int a) {
		this.name=name;
		this.a=a;
		System.out.println(name+ " " +a);
	}
	
	public static void main(String[] args) {
		AAthis b=new AAthis();
		b.m1("Harshu", 10);
       System.out.println(b.a);
       System.out.println(b.name);
       System.out.println(b.c);
       
	

}
}