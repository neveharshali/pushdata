package Practice;

public class string {

	public static void main(String[] args) {
		//String a="Harshali Neve";
		//String [] b=a.split(" ");
		//System.out.println(b.length);
		//for(int i=b.length-1;i>=0;i--) {
			
			//System.out.print(b[i]+ " ");
		//}
		String a="mam";
	    String c=a;
		String b=" ";
		for(int i=a.length()-1;i>=0;i--) {
			//System.out.print(a.charAt(i));
			b=b+a.charAt(i);
			
		}
		//System.out.print(b);
	
	if(c.equals(b)) {
		System.out.println("pallindrome no");
	}else {
		System.out.println("not pallindrome");
	}

	}
}
