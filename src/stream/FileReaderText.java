package stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이것이 주석이다.
		FileReader fr = null;
		try {
			fr = new FileReader("src/stream/FileInputText.java");
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
