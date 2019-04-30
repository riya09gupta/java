package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceprtion {
	public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	try {
	System.out.println("Enter the value of x and y");
	System.out.println("Enter the first no :");
	float x= s.nextFloat();
	System.out.println("Enter the second no.");
	float y=s.nextFloat();
	s.nextLine();
	float z=x/y;
	System.out.println("division is "+z);
	System.out.println("Enter the user id");
	String id= s.nextLine();
	int i = Integer.parseInt(id);
	System.out.println("userb id is : "+i);
	}
	catch(InputMismatchException e) {
		System.out.println("Enter only no. not characters");
		
	}
	catch(ArithmeticException ae) {
		System.out.println("not div");	
	}
	catch(NumberFormatException aa) {
		System.out.println("numbers only");
	}
	finally {
		System.out.println("done");
	}
	}
}
