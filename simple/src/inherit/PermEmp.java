package inherit;

public class PermEmp extends Employee {
	float bsal;
	float da;
	float hra;
	public PermEmp() {
		
	}
	public PermEmp(int id,String name,float bsal) {
		super(id,name);
		this.bsal = bsal;	
	}
	void calcSal() {
		da = (20*bsal)/100;
		hra = (15*bsal)/100;
		salary = bsal+da+hra;
		
	}
	void print() {
		super.print();
		System.out.println("bsal is "+bsal);
		System.out.println("da is "+da);
		System.out.println("hra is "+hra);
	}

}
