package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이것이 주석이다.
				FileReader fr = null;
				BufferedReader br = null;
				try {
					fr = new FileReader("src/stream/FileInputText.java");
					br = new BufferedReader(fr);
					
					String txt = null;
					while((txt = br.readLine()) != null) {
						System.out.println(txt);
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
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
	}

}
