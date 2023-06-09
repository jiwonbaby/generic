package stream;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text4.txt");
		System.out.println(file.isFile()); //파일 형식인지
		System.out.println(file.isDirectory()); //디렉토리 형식인지
		System.out.println(file.getName()); // 파일이름 확인
		System.out.println(file.getAbsolutePath()); //파일경로 확인
		System.out.println(file.getPath());
		System.out.println(file.canRead()); //파일 속성 확인
		System.out.println(file.canWrite()); //읽을 수 있는 파일인지
		System.out.println(file.length()); // 파일의 크기 확인
	}

}
