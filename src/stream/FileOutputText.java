package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fo = new FileOutputStream("text.txt");
			fo.write(65);
			fo.write(66);
			fo.write(67);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
