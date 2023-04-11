package a2_loopingstatement;

public class Even_noPractice {
	public void seqence() {
	// print 5 to 100 even no
			System.out.println("Even_no");
			for(int d=5;d<=100;d++) {
				if(d%2==0)
				{
					System.out.println(d);
				}
			}
			
	}
	public void reverse() {
		// print 100 to 5 even no
				System.out.println("Reverse_Even_no");
				for(int k=100;k>=5;k--) {
					if(k%2==0)
					{
						System.out.println(k);
					}
				}
				
		}


	public static void main(String[] args) {
		Even_noPractice a= new Even_noPractice();
		a.seqence();
		a.reverse();

	}

}
