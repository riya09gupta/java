package no;
import java.util.Scanner;
public class TestNumber {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many no. you want to enter");
		int i=s. nextInt();
		int []  k = new int[i];
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		for (int j =0;j<i;j++) {
        System.out.println("Ente the "+(j+1)+"th number");
        k[j] = s.nextInt();
        if(k[j]<0) {
        count+= 1;
        }
        else if(k[j]>0) { 
        	count1+=1; 
        }
        else {
        	count2+=1;
        }  
		}
		for ( i=0;i<k.length;i++)
		{
			
		
	    System.out.println("numbers are" +k[i]);
		}
	    System.out .println("Negative no. are" +count);
		System.out.println("Positive no. are" +count1);
		System.out.println("zeores are " +count2);	
	}
}
