package constructor;

public class Practice_on_constructot {
	String name;
	int age;
	String sirname="Neve";
	public Practice_on_constructot(String name,int age) {
		this.name= name;
		this.age=age;
		System.out.println(this.name+ "  " +this.sirname+" "
				+ " : "+this.age);
	}

	public static void main(String[] args) {
		//System.out.println("name " );
		Practice_on_constructot a= new Practice_on_constructot("Harshali",24);
		
	}

}
