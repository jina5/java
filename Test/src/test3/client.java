package test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class client {
	/*
	 * - 클라이언트는 서버에 접속을 한다. - 서버에 접속 후 사용자로 부터 필요한 숫자를 입력 받음 - 받은 숫자를 서버로 전송함 - 서버로
	 * 전송 후 받은 약수 목록 및 약수들의 합을 출력할 것.
	 */
	public static void main(String[] args) {
		Socket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		Scanner sc = new Scanner(System.in);
		try {
			server = new Socket("127.0.0.1", 9999);
			br = new BufferedReader(new InputStreamReader(server.getInputStream()));
			pw = new PrintWriter(server.getOutputStream());

			System.out.print("숫자 입력 : ");
			int n = sc.nextInt(); sc.nextLine();
			pw.print(n); //pw 로 보내니까 숫자가 문자형이 된다... 숫자 1을 49로 인식!!  
			pw.flush();
			n = br.read();
			System.out.println("보낸 숫자의 약수들의 총합 :"+ n);
			

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sc != null)
					sc.close();
				if (pw != null)
					pw.close();
				if (br != null)
					br.close();
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
