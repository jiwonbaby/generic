package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputText3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
			try {
				fis = new FileInputStream("src/stream/FileInputText.java");
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while((data = fis.read(buf,0,fis.available())) != -1){
				System.out.print(new String(buf,0,data));
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

