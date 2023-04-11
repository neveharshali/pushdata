package test12;

public class SelectionStatement {

	public static void main(String[] args) {
		int b=15;
		String name="HARSHALI";
		//Simple if ---> if(condition){   }
		//if(true_condition){then print}
		if(b>0) {
			System.out.println("B is greater than zero");
		}
		//if(condition){wrong_data} or else{true_data}
		// if----else if(condition){ }else{ }
		int a=10;
		if(a<0) {
			System.out.println("A is greater than zero");
		}
		else {
			System.out.println("A is less than zero");
		}
		//string_code
		if(name.equalsIgnoreCase("harshali")) {
			System.out.println("Both Strings are equals ");
		}
		
        String file="Harshali.csv";
		
		if(file.endsWith(".pdf")) {
			
			System.out.println("File Upload ");
		}
		else {
			System.out.println("Upload pdf file only");
		}
   	}

}
