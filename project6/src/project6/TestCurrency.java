package project6;
import java.util.Scanner;
public class TestCurrency {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		Currency c = new Currency();
		System.out.println("1.rupee to doller\t2.doller to rupee");
		int i = s.nextInt();
		switch(i) {
		case 1:
			System.out.println("Enter the rupee :-");
			c.setRupee(s.nextFloat());
			c.rupeeToDoller();
			break;
		case 2:
			System.out.println("Enter the doller");
			c.setDoller(s.nextFloat());
			c.dollerToRupee();
			break;
		default:
			System.out.println("invalid");
				
		}
	}

}

