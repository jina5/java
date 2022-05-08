package io;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * 파일명을 사용자로부터 입력받아서 파일을 생성한 후
 * 사용자로부터 문자열을 입력받아서 입력받은 내용을
 * 생성한 파일에 출력 
 * 단 exit 라는 단어를 입력하면 사용자로부터 입력 종료
 * 오픈한 파일 역싯 close 작업을 수행
 */
public class NotePad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("파일 제목 :");
		String fileName = sc.nextLine();
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(fileName, true);
			pw = new PrintWriter(fw);
			String str = "";
			
			// while(!(str=sc.nextLine()).equals("exit")){
			// pw.println(str);
			// pw.flush();}
			// 이렇게 해도됨

			while (true) {
				str = sc.nextLine();
				if (str.equals("exit"))
					break; //return; 해도 finally 실행된다.
				pw.println(str);
				pw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pw != null)
					pw.close();
				if (fw != null)
					fw.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
