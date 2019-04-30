package no;
import java.util.Scanner;
public class OverTime {
	public static void main(String [] args) {
		int pay;
		int eh;
		Scanner s = new Scanner(System.in);
		System.out.println("Employee regular time is 40 hours");
		for (int j=0;j<10;j++) {
			System.out.println("Enter the hours of "+(j+1)+ "employee ");
			int h = s.nextInt();
			if (h>40) {
				eh= h-40;
				pay = 12*eh;
				System.out.println("over time pay is "+pay);
			}
			else {
				System.out.println("NO overtime!!!!!!!!!!!!");
			}	
		}	
	}
}
