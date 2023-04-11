package String_Program;

public class ReverseString1 {

	public static void main(String[] args) {
		// Revers_String
		String a= "SHINCHAN", b="";
        char ch;
         int c= a.length();
      System.out.print("Original word: ");
      System.out.println("SHINCHAN"); //Example word
       
      for (int i=c-1;i>=0;i--)
      {
        
        b= b+a.charAt(i); //adds each character in front of the existing string
        
      }
      System.out.println("Reversed word: "+b);


	}

}
