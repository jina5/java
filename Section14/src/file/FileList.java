package file;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File root = new File("c:\\");
		File[] list = root.listFiles();
		
		for(File file : list) {
			String fileName = file.getName();
			long fileSize= file.length();//파일 사이즈 //폴더의 용량은 안나와서 0으로 나옴..
			String etc = file.isDirectory()?"<DIR> ":"\t\t"+fileSize;
			System.out.println(fileName+"\t\t"+etc);
			
		}
	}

}
