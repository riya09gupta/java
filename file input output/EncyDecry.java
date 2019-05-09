package encydecry;
import java.io.*;

public class EncyDecry {
	//FileInputSteam fis = new FileInputStream(C:\\users\\ditiss\\Desktop\\notice.txt);

	static void encrypt() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\users\\ditiss\\Desktop\\notice2.txt");
		FileOutputStream fos = new FileOutputStream("C:\\\\users\\\\ditiss\\\\Desktop\\\\notice3.txt");
		int ch=0;
		while((ch=fis.read())!=-1) {
			ch++;
			fos.write(ch);
			
		}
		fos.close();
		}
	static void decrypt() throws IOException {
		FileInputStream ff  = new FileInputStream("C:\\users\\ditiss\\Desktop\\notice3.txt");
		FileOutputStream gg = new FileOutputStream("C:\\\\users\\\\ditiss\\\\Desktop\\\\notice4.txt");
		int cd = 0;
		while((cd = ff.read())!= -1) {
			cd--;
			gg.write(cd);
			
		}
		gg.close();
	}
	public static void main(String [] args) throws IOException {
		encrypt();
		decrypt();
		
		
	}

	
	}
		


