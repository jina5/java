package file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:\\test\\test.txt"); //폴더구분 : \\ or file.separater
		System.out.println(file); //파일 경로
		System.out.println(file.getParent()); //파일을 가지고 있는 폴더 경로
		File parentFile = file.getParentFile(); //부모폴더 경로까지만
		System.out.println(parentFile.getAbsolutePath());//현재 파일 객체의 절대 경로
		System.out.println(parentFile.exists());//해당 경로가 존재하는지? false
		if(!parentFile.exists()) { //파일 생성전에 파일이 위치한 폴더 경로가 있는지 체크
			parentFile.mkdirs(); //(makedirectory) mkdirs : 해당 경로까지의 모든 폴더를 생성 (상위폴더까지) / dir : 폴더하나만! 
			System.out.println("해당 경로 폴더를 전부 생성");
		}
		try {
			boolean result = file.createNewFile();//파일 생성
			System.out.println(result);
			file.delete(); //파일 삭제
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}
