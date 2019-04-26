package inherit;

public class Employee {
	int id;
	String name;
	float salary;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name) {
		this.id = id;
		this.name=name;
		
	}
	void calcSal() {
		
	}
	void print() {
		System.out.println("employee id is :- " +id);
		System.out.println("employee id name :- " +name);
		System.out.println("employee salary is :- " +salary);
		
	}

}
