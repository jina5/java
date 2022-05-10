package test3;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class lottoclient {

	public static void main(String[] args) {
		/*
		 * 클라이언트는 서버에 접속 서버에 접속 후 사용자로부터 필요한 로또 번호 세트 개수를 입력 받음 받은 개수를 서버로 전송함 서버로 전송 후
		 * 받은 로또번호를 출력
		 */

			Socket server = null;
			BufferedReader br = null;
			DataOutputStream dos = null;
			Scanner sc = null;
			
			try {
				server = new Socket("127.0.0.1",5000);
				dos = new DataOutputStream(server.getOutputStream());
				br = new BufferedReader(new InputStreamReader(server.getInputStream()));
				sc = new Scanner(System.in);
				
				System.out.print("구매할 로또번호 개수 입력 : ");
				int ea = sc.nextInt();
				
				dos.writeInt(ea);
				dos.flush();
				
				String str = br.readLine();
				String[] arr = str.split("\t");
				for(String s : arr)
					System.out.println(s);
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(br != null)br.close();
					if(dos != null)dos.close();
					if(server != null)server.close();
				} catch (IOException e) {
					e.printStackTrace();
			}

		}
	}
}