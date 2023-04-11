package test12;

public class SelectStatement_4 {
	public void m1() {
		int b=80;
		if(b>=0) {
			System.out.println("Enter  1st if");
			if(b!=0) {
				System.out.println("Enter  2nd if");
			
			      if(b==0) {
				       System.out.println("Enter 3rd if");
			               } 
			      else {
				     System.out.println("Enter 3rd else");
			           }
			        }  
			   else {
				System.out.println("Enter 2nd else");
			        }
		        }  
		
		else {
			System.out.println("Enter outer else");
		}

		
	}

	public static void main(String[] args) {

		SelectStatement_4 t= new SelectStatement_4();
		       t.m1();
			}
	

}
