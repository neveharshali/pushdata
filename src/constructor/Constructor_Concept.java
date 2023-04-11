package constructor;

public class Constructor_Concept {
	String name;
	int id;
	public Constructor_Concept() {//no_argument constructor
		name="Harshali";
		id=101;
	}
	public Constructor_Concept(String name,int id) {
		this.name=name;
		this.id=id;
		System.out.println(name+"  "+id);
	}

	public static void main(String[] args) {
		Constructor_Concept c= new Constructor_Concept();
		System.out.println(c.name);
		System.out.println(c.id);
		Constructor_Concept d= new Constructor_Concept("Akash",102);

	}

}
