package abstraction;

public class cls2 implements inter2,inter3 {

	public void CENTRAL_BANK() {
		System.out.println("CENTRAL_RATE OF INTEREST=>2.5%");
		
	}
	
	public void ICICI_BANK() {
		System.out.println("ICICI_RATE OF INTEREST=>3.5%");
		
	}

	
	public void SBI_BANK() {
		System.out.println("SBI_RATE OF INTEREST=>4.5%");
		
	}

	
	public void BHADHAN_BANK() {
		System.out.println("BHADHAN_RATE OF INTEREST=>5.5%");
		
	}
	public static void main(String[] args) {
		inter2 a= new cls2();
		a.BHADHAN_BANK();
		a.SBI_BANK();
		inter3 b= new cls2();
		b.CENTRAL_BANK();
		b.ICICI_BANK();

	}

}
