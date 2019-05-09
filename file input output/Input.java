package streo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {
	static float vowel =0,conso =0,digit =0,spaces=0;
	static float pervowel,perconso,perdigit;
	static String str =  " ";
	static int length,result;
	
	
	static void calculate() {
	 pervowel = ((vowel)*100)/str.length();
	 perconso = ((conso)*100)/str.length();
	 perdigit = ((digit)*100)/str.length();
	 print();
	}
	
	
	 static void print() {
		System.out.println("persent vowel is"+pervowel);
		System.out.println("persent conso is"+perconso);
		System.out.println("per digit is"+perdigit);
	}
	public static void main(String [] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\users\\ditiss\\Desktop\\notice.txt");
				int chh=0;
		while((chh=fin.read())!=-1) {
			str += (char)chh;
			
			System.out.print((char)chh);
			
		}
		length = str.length()-str.replace(" ","").length();
		//System.out.println(str.replace(" ", "").length());
		result= str.length()-length;
		for(int i = 0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowel;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++conso;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digit;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
		
		}
		System.out.println("vowels are : "+vowel);
		System.out.println("consonents are : "+conso);
		System.out.println("digits are : "+digit);
		System.out.println("spaces are : "+spaces);
		System.out.println("string length is :" +str.length());
		System.out.println("total spaces are : "+length);
		System.out.println(" req length"+result);
		 calculate();
		
		
	}


}
