package test3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class numberserver {
	/*
	 * 
	 * 서버 - 서버는 포트번호 9999을 지정하여 서버를 오픈한다. - 클라이언트로 부터 숫자 하나를 받아서 해당 숫자의 약수 목록을 작성한다.
	 * - 생성한 약수 목록을 클라이언트에게 전송한다.
	 */
	public static void main(String[] args) {
		ServerSocket server = null;
		DataInputStream dis = null;
		PrintWriter pw = null;		
		try {
			server = new ServerSocket(9999);
			Socket client = server.accept();
			pw = new PrintWriter(client.getOutputStream());
			dis = new DataInputStream(client.getInputStream());
			int num = dis.readInt();
			String result = "";
			
			
			for(int i=1;i<num;i++) {
				if(num % i == 0)
					result += i + "\t";
			}
			result += num;
			pw.println(result);			
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis != null)dis.close();
				if(pw != null)pw.close();
				if(server != null )server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			

		}

	}

}
