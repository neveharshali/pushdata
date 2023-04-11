package test12;

public class PracticeBasis {
	 int a=10;
	  int b=20;
      public void add() {//adition
    	 
    	  int c=a+b;
    	  System.out.println("addition is=" +c);
      }
      public void show() {//if--else
    	  if(a>b) {
    		  System.out.println("A is greater B");
    	  }
    	  else {
    		  System.out.println("A is less than B");
    	  }
    	  
      }
      public void display() {//Nested--if
    	  if(a<b) {
    		  System.out.println("Enter 1st if block");
    		  if(a==b) {
    			  System.out.println("Enter 2nd if block");
    		  }
    		  else {
    			  System.out.println("Enter 2nd else block");
    		  }
    	  }
    	  else {
    		  System.out.println("Enter 1st else block");
    	  }
      }
    	  
  
	public static void main(String[] args) {
		PracticeBasis m=new PracticeBasis();
		m.add();
		m.show();
		m.display();

	}

}
