package inherit;
import java.util.Scanner;
public class Com {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the PERMANENT EMPLOYEE details ............");
		System.out.println("Enter the employee id");
		int i = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the employee name");
		String nm = scan.nextLine();
		System.out.println("Enter the employee base salary");
		float bs = scan.nextFloat();
		scan.nextLine();
		PermEmp emp = new PermEmp(i,nm,bs);
		emp.calcSal();
		emp.print();
		System.out.println("Enter the CONSULTANT EMPLOYEE details ............");
		
		System.out.println("Enter the employee id");
		int ii = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the employee name");
		String nmm = scan.nextLine();
		System.out.println("Enter the employee hours" );
		float hrs= scan.nextFloat();
		System.out.println("Enter the rate for each hour");
		float rt = scan.nextFloat();
		Consultant cons = new Consultant(ii,nmm,hrs,rt);
		cons.calcSal();
		cons.print();		
	}

}
