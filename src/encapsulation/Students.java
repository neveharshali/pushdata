package encapsulation;

public class Students {
	private int rollno;//data hiding
	private String name;
	public void setrollno(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public int getrollno() {
		return rollno;
	}
	public static void main(String[] args) {
		Students a=new Students();
		a.setrollno(101,"Harshu");
		System.out.println(a.getrollno());
		System.out.println(a.getname());
		
		//a.setrollno(102);
		//System.out.println(a.getrollno());

	}

}
