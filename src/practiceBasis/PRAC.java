package practiceBasis;

public class PRAC {

	public static void main(String[] args) {
		String a= "mam";
		String b= "";
		
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(a.equals(b)) {
			System.out.println("Pallindrome_String");
		}
		else {
			System.out.println("Non_Pallindrome string");
		}

	}

}
