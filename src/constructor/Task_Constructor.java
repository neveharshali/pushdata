package constructor;

public class Task_Constructor {
	String name;
	int marathimarks;
	int mathmarks;
	int englishmarks;
	public Task_Constructor(String name,int marathimarks,int mathmarks,int englishmarks) {
		this.name=name;
		this.marathimarks=marathimarks;
		this.mathmarks=mathmarks;
		this.englishmarks=englishmarks;
		System.out.println(this.name+": "+"     "+this.marathimarks+"      |"+"    "+this.mathmarks+"     |"+"      "+this.englishmarks+"      |");
	}

	public static void main(String[] args) {
		System.out.println("id.name"+" :"+" "+"marathimarks |"+" "+"mathmarks |"+" englishmarks |");
		System.out.println("--------:--------------|-----------|--------------|");
		Task_Constructor a= new Task_Constructor("1.Harshu",98,97,96);
		Task_Constructor b= new Task_Constructor("2.Akashu",95,94,90);
		Task_Constructor c= new Task_Constructor("3.Nikhil",78,97,63);
		Task_Constructor d= new Task_Constructor("4.Rupesh",98,97,96);
		Task_Constructor e= new Task_Constructor("5.Bharti",98,97,96);
		Task_Constructor f= new Task_Constructor("6.Praksh",98,97,96);
		Task_Constructor g= new Task_Constructor("7.Swara ",98,97,96);
		Task_Constructor h= new Task_Constructor("8.Devsvi",98,97,96);
		Task_Constructor i= new Task_Constructor("9.dhanu ",98,97,96);
		Task_Constructor j= new Task_Constructor("10.Akash",98,97,96);
		System.out.println("--------:--------------|-----------|--------------|");

	}

}
