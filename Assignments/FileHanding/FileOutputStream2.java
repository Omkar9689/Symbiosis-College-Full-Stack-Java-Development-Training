package FileHanding;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutputStream2 {
	
	static String fname="D:\\Barbade Omkar S\\HelloWorld\\src\\FileHanding\\text2.txt";
	
	public static void method3() {
		
		try {
			
			FileOutputStream fout = new FileOutputStream(fname);
			PrintStream pout = new PrintStream(fout);
			pout.println(1234);
			pout.println("CMCS");
			pout.println("Welcomes you all");
			
			fout.close();
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method3();

	}

}
