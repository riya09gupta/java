package project6;

public class Currency {
	float amt;
	private float rupee;
	private float doller;
	
	public float getRupee() {
		return rupee;
	}
	public void setRupee(float rupee) {
		this.rupee = rupee;
	}
	public float getDoller() {
		return doller;
	}
	public void setDoller(float doller) {
		this.doller = doller;
	}
	void rupeeToDoller(){
		amt = rupee/75;
		showResult();
		
	}
	void dollerToRupee() {
		amt = doller*75;
		showResult();
		
	}
	void showResult() {
		System.out.println("total amount is " +amt);
	}

}
