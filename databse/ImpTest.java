package assignment;

import java.sql.SQLException;
import java.util.Scanner;

public class ImpTest {

	public static void main(String[] args) throws Throwable {
		Test tt = new Test();
		Scanner s = new Scanner(System.in);
		int i;
		do {
		System.out.println("Enter your choice");
		System.out.println("1.add\t2.delete\t3.update\t4.dispay\t5.whole table display");
		 i = s.nextInt();
		s.nextLine();
		
		switch (i)
		{
		case 1:
			tt.add();
			break;
		case 2:
			tt.delete();
			break;
		case 3:
			tt.update();
			break;
		case 4:
			tt.fetch();
			break;
		case 5:
			tt.display();
			break;
		default:
			System.out.println("wrong");
			
		}
		}while(i<6);

	}

}
