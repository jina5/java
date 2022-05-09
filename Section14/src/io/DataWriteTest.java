package io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriteTest {

	public static void main(String[] args) {
		FileOutputStream fos = null; // filewriter는 글자단위로 출력, outputstream은 byte단위로 출력
		DataOutputStream dos = null; // 프로세스스트림
		
		//~stream : byte로...
		try {
			fos = new FileOutputStream("data.dat");
			dos = new DataOutputStream(fos);

			int n = 100;
			double pi = 3.1415;
			char ch = 'A';
			boolean flag = true;

			dos.writeInt(n);
			dos.writeDouble(pi);
			dos.writeChar(ch);
			dos.writeBoolean(flag);
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dos != null)
					dos.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
