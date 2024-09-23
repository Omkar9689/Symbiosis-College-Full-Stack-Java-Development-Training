package FileHanding;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	
	static String fname="D:\\Barbade Omkar S\\HelloWorld\\src\\FileHanding\\abc.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CharArrayWriter out = new CharArrayWriter();
			out.write("My name is Omkar");
			
			FileWriter f1 = new FileWriter(fname);
			out.writeTo(f1);
			
			f1.close();
		}
		catch(Exception e) {
			System.err.println("Error");
		}
	}

}
