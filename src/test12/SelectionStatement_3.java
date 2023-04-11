package test12;

public class SelectionStatement_3 {

	public static void main(String[] args) {
		////if (condition)----elseif(condition)
		
		int l=100;
		if(l<0) {
			System.out.println("executed if condition");
		}
		else if(l<=0) {
			System.out.println("executed 1st else_if condition");
		}
		else if(l==0) {
			System.out.println("executed 2nd else_if condition");
		}
		else {
			System.out.println("executed else condition");
		}
		

	}

}
