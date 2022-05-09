package test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class server {
	/*
	 * 
	 * 서버 - 서버는 포트번호 9999을 지정하여 서버를 오픈한다. - 클라이언트로 부터 숫자 하나를 받아서 해당 숫자의 약수 목록을 작성한다.
	 * - 생성한 약수 목록을 클라이언트에게 전송한다.
	 */
	public static void main(String[] args) {
		ServerSocket server = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		ArrayList<Integer> list = new ArrayList<Integer>();

		try {
			server = new ServerSocket(9999);
			Socket client = server.accept();
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());

			Integer n = br.read();
			int[] arr = new int[n];
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					int j = 0;
					arr[j] = i;
					j++;
				}
			}
			int sum = 0;
			for (int num : arr) {
				sum += num;
			}

			pw.println(sum);
			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
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
