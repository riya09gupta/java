package streo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Outp {
	public static void main(String [] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\\\users\\\\ditiss\\\\Desktop\\\\notice2.txt");
		String data = "this is my second java.\nI am ajava coder.\nmy name is riya gupta.\ni dont like coding and all. ";
		fos.write(data.getBytes());
		fos.close();
		
	}

}
