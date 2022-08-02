
public class Stud extends Person1 {
	int rollno;
	String Dept;
	void setStud(int rollno,String Dept) {
		this.rollno=rollno;
		this.Dept=Dept;
	}
	void displayStud(){
		System.out.println("rollno "+rollno);
		System.out.println("Dept is "+Dept);
	}
	
	public static void main(String[] args) {
		Stud s= new Stud();
		s.set("manoj",18,'m');
		s.display();
		s.setStud(4,"cs");
		s.displayStud();

	}

}
