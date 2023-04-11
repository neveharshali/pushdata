package abstraction;

public  class MainHead extends Bank {
    void SBI() {
    	System.out.println("rate of interest=> 2%");
    }
    
	void HDFC() {
		System.out.println("rate of interest=> 3%");
		
	}
	
	void AXIS() {
	
		System.out.println("rate of interest=> 4%");
	}
	
	void UNION() {
		
		System.out.println("rate of interest=> 5%");
	}

	public static void main(String[] args) {
		MainHead A= new MainHead();
		A.SBI();
		A.AXIS();
		A.HDFC();
		A.UNION();
		
		

	}
	
}
