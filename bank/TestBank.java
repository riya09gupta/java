package bank;
import java.util.Scanner;
public class TestBank {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		//Bank b= new Bank(name,accno,type,inbal);
		System.out.println("Enter the account holder name: ");
		String name = s.nextLine();
		System.out.println("Enter the account no.: ");
		long accno = s.nextLong();
		s.nextLine();
		System.out.println("Enter the account type: ");
		String type= s.nextLine();
		System.out.println("Enter the initial balnc : "); 
		float inbal = s.nextFloat();
		Bank b= new Bank(name,accno,type,inbal);
		System.out.println("1.Deposit\n2.Withdraw");
		int i = s.nextInt();
		switch(i) {
		case 1:
			System.out.println("Enter the amount you want to deposit: ");
			float amount = s.nextFloat();
			b.deposit(amount);
			b.print();
			break;
		case 2:
			System.out.println("your clear balnc is : " + inbal);
			System.out.println("Enter the amount you want to withdraw: ");
			float amountt = s.nextFloat();
			
			b.withdraw(amountt);
			b.print();
			break;
		default:
			System.out.println("Wrong choice!!!!!!!!!!!!!");
			
		}
	}

}
