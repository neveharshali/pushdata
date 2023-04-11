package jumpStatement;

public class BreakStatement {
	public void show() {
		for(int a=1;a<=20;a++) {
			System.out.print(a+" ");
			if(a==19) {
				break;
			}
		}

	}
	public void display() {
		for(int b=15;b>=1;b--) {
			if(b==10) {
				break;
			}
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		BreakStatement c=new BreakStatement();
        c.show();
        c.display();
	}

}
