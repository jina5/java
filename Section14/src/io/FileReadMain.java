package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) {
		FileReader fr = null; // 노드스트림
		BufferedReader br = null; // 부가적인 프로세스스트림

		try {
			fr = new FileReader("text.txt");
			br = new BufferedReader(fr);
			String str = null;
//			while((str = br.readLine()) != null) { //readline:한줄씩 읽어오기
//				System.out.println(str);
//			}

			while (true) {
				str = br.readLine(); // 파일에서 한줄 읽어옴
				if (str == null)
					break; // 읽어온 내용이 null이면 더이상 읽을 내용이 없다.
				System.out.println(str); 
			}

		} catch (FileNotFoundException e) { // 쓰기모드는 입출력 관련 에러만, 읽기모드는 파일이 있는지없는지 체크
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
