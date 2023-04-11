package jumpStatement;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int a=1;a<=10;a++) {
			
			if(a==8) {//condition true then exit loop
				continue;
			}
			System.out.print(a+" ");
		}

	}

}
