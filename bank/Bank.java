package bank;

public class Bank {
	String name;
	long accno;
	String type;
	float initialbalnc;
	float balnc;
	public Bank(String name, long accno, String type, float initialbalnc) {
		this.name = name;
		this.accno = accno;
		this.type = type;
		this.initialbalnc = initialbalnc;
	}
	void deposit(float amount) {
		//System.out.println("Enter the amount you want to withdraw");
		balnc =initialbalnc+amount;
		
	}
	void withdraw(float amountt) {
		//System.out.println("your account balance is : "+initialbalnc);
		balnc = initialbalnc - amountt;
		
		
	}
	void print() {
		System.out.println("Account holder name: "+name);
		System.out.println("Account no.: "+accno);
		System.out.println("Account type: "+type);
		System.out.println("Clear balance is :" +balnc);
	}
	

}
