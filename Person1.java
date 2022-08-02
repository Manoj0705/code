
public class Person1 {
	String name;
	int age;
	char gender;
	void set(String name, int age, char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void display() {
		System.out.println("Name "+name);
		System.out.println("age "+age);
		System.out.println("gender "+gender);
	}
}
