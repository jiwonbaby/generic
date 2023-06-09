package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이것이 주석입니다
		try {
			FileInputStream fis = new FileInputStream("src/stream/FileInputText.java");
		int data = 0;
		while((data = fis.read()) != -1){
			System.out.print((char)data);
			
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
