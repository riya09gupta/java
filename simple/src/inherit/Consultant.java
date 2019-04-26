package inherit;

public class Consultant extends Employee {
	float hr;
	float rateperhr;
	public Consultant() {
		
	}
	public Consultant(int id,String name,float hr,float rateperhr) {
		super(id,name);
		this.hr= hr;
		this.rateperhr = rateperhr;
		
	}
	void calcSal() {
		salary = hr*rateperhr;
	}
	void print() {
		super.print();
		System.out.println( "employee hours is:" +hr);
		System.out.println("payment of each hours is :" +rateperhr);
	}

}
