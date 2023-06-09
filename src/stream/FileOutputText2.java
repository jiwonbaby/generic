package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputText2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo = new FileOutputStream("text.txt", true);
			byte[] b = new byte[26];
			byte data = 65;
			for(int i=0;i<b.length;i++) {
				b[i] = data;
				data++;
			}
			fo.write(b);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
