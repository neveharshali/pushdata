package Exception;

public class Exception_handling {

	public static void main(String[] args) {
  try {	
	int a=20;
	int b=0;
	int c;
	c=a/b;
     }
  catch(Exception e) {
	  System.out.println(e);
  }
  finally {
	  System.out.println("Iam finally block");
  }
	}

}
