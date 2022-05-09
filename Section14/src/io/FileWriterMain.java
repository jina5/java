package io;
//파일 읽기모드, 쓰기모드, 추가모드 있다
//쓰기모드는 파일 계속 새로 생성 (true 추가하면 추가모드가 되어 이어쓰기 가능)
//추가모드 파일이 없으면 새로 생성 (파일이 있으면 새로만들지 않고 출력할 커서를 파일 맨 끝으로 보냄, 이어쓰기)

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterMain {

	public static void main(String[] args) { 
		FileWriter fw = null;
		PrintWriter pw = null;
		try { //쓰기모드 : 쓰기용으로 파일을 열면 매번 파일을 새로 생성
			fw = new FileWriter("hello.txt");// 저장할 파일 경로
//			fw = new FileWriter("hello.txt",true); true 넣으면 실행할때마다 문구가 추가된다 (추가모드)
			pw = new PrintWriter(fw); //프로세스 스트림 초기화
//~er : 문자열... 
			pw.println("안녕하세요");
			pw.println("Hello World");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { //fw가 먼저 생성되었기때문에 먼저 없어지면 문제가 생길수있음. pw 먼저 close
				if (pw != null) pw.close();
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
//실행하고 프로젝트 클릭상태에서 F5누르면 hello.txt 생긴다
//여러번 실행해도 파일에 글씨 그대로임... 매번 파일을 새로 만들었기때문...
