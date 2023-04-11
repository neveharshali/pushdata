package practiceBasis;

public class Pallindrome_string {

	public static void main(String[] args) {
		String a="mam";
		
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
		b=b+a.charAt(i);
		}
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Pallindeome_string");
		}else {
			System.out.println("Non_PallindromeString");
		}

	}

}
