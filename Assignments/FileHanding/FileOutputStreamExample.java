package FileHanding;

import java.io.*;

public class FileOutputStreamExample {
	static String fname="D:\\Barbade Omkar S\\HelloWorld\\src\\FileHanding\\text.txt";


	public static void method2() {
		try {
			FileOutputStream fout = new FileOutputStream(fname);
			String str="Hello this is Joker";
			byte [] barr=str.getBytes();
			fout.write(barr);
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
		method2();
		
	}
}
