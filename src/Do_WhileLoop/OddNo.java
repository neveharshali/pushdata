package Do_WhileLoop;

public class OddNo {

	public static void main(String[] args) {
       //print sequence of oddno 50 to 100.
		System.out.println("SEQUENCE OF ODD_NO");
       int a=50;
       do {
    	   if(a%2!=0) {
    		   System.out.println(a);
    	   }
    	   a++;
       }while(a<=100);
       
     //print reverse of oddno 100 to 50.
     		System.out.println("REVERSE OF ODD_NO");
            int b=100;
            do {
         	   if(b%2!=0) {
         		   System.out.println(b);
         	   }
         	   b--;
            }while(b>=50);
	}

}
