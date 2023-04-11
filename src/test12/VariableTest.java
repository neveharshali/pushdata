package test12;

public class VariableTest {
	int i=60;//Instance variable-->declare inside class but out side method-->non_static variable

	static int j=70;/*static variable-->declare inside class but outside method-->use keyword static
	                                                                              & class variable*/
	public static void main(String[] args) {
		int h=50;//local variable-declare inside method
		System.out.println(h);//50
		
		VariableTest test=new VariableTest();//class object creation-->call non static variable
		System.out.println(test.i);//60
		
		System.out.println(j);//70
	}

}
