package generic;
import java.util.Scanner;

public class TestCode {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the code type ");
		System.out.println("1.Integer\t2.float\t3.String");
		int i = sc.nextInt();
		sc.nextLine();
		//object d = sc.next
		switch (i) {
		case 1:
			System.out.println("ENTER the code ");
			int a = sc.nextInt();
			Code<Integer> cc = new Code<>(a);
			System.out.println("Code type is :" +cc.getCode().getClass().getSimpleName());
			cc.print();
			break;
		case 2:
			System.out.println("ENTER the code ");
			float b = sc.nextFloat();
			Code<Float> c2 = new Code<>(b);
			System.out.println("Code type is :" +c2.getCode().getClass().getSimpleName());
			c2.print();
			break;
		case 3:
			System.out.println("ENTER the code ");
			String c = sc.nextLine();
			Code<String> ccc = new Code<>(c);
			System.out.println("Code type is :" +ccc.getCode().getClass().getSimpleName());
			ccc.print();
			break;
		default:
			System.out.println("Wrong Choice !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			
			
		}
		
	}

}
