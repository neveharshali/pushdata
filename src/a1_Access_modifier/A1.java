package a1_Access_modifier;

public class A1 {
     public int a=10;
     protected int b=20;
     private int c=30;
     int d=23;
    // Protected String Name="Harshali";
	public static void main(String[] args) {
		A1 x=new A1();
		System.out.println(x.a);//public
		System.out.println(x.b);//protected
		System.out.println(x.c);//private
		System.out.println(x.d);//default
	}

}
