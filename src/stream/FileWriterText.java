package stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw =  new FileWriter("text3.txt");
			fw.write('A');
			
			char[] buf = {'B', 'C', 'D'};
			fw.write(buf);
			fw.write(buf, 1, 2);
			fw.write("똥남이 너무 귀여워");
			fw.flush();//강제로 빈 값을 출력
			fw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
