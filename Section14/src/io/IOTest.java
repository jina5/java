package io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class IOTest {
	public String readline() {
		InputStreamReader isr = new InputStreamReader(System.in); // system.in : 키보드
		char buffer[] = new char[10]; // 입력받은 내용 임시로 저장하는 배열 buffer
		String message = null; // 내용을 문자열로
		int idx = 0; // 어디까지 저장되었는지, 인덱스번호 체크
		try {
			do {
				// 배열에 내용이 가득차있으면 배열의 길이를 늘린다
				if (idx == buffer.length - 1) // 이때 배열에 내용이 가득차있는 상태
					buffer = reallocBuffer(buffer);
				buffer[idx] = (char) isr.read(); // 한글자씩 입력 받음
				idx++;
			} while (buffer[idx - 1] != '\n'); // 엔터 입력까지..
			// System.out.println(Arrays.toString(buffer));
			for (int i = 0; i < idx; i++)
				System.out.println((int) buffer[i] + " ");

			message = String.copyValueOf(buffer, 0, idx - 2); // -2 : 줄바꿈 (\r \n)
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (isr != null) // close는 null 체크 먼저 확인하기
					isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return message;
	}

	private char[] reallocBuffer(char[] buffer) {
		char[] temp = buffer; // 임시 배열에
		buffer = new char[temp.length * 2];
		for (int i = 0; i < temp.length; i++) {
			buffer[i] = temp[i];
		}
		return buffer;

	}

	public void println(String msg) {
		char buf[] = msg.toCharArray();
		OutputStreamWriter osw = new OutputStreamWriter(System.out); // 출력
		try {
			osw.write(buf);
			osw.flush(); // write하면 flush 해야함. flush 해줘야 메모리에서 저장된 출력할 내용 보내줌
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (osw != null)
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}
}
