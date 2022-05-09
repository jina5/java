package test3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Random;

public class lottoserver {

	public static void main(String[] args) {

		/*
		 * 서버는 포트번호 5000을 지정하여 서버를 오픈한다 클라이언트로부터 숫자 하나를 받아서 해당 숫자만큼 생성한 로또번호를 클라이언트에게 전송
		 */

		ServerSocket server = null;
		DataInputStream dis = null;
		PrintWriter pw = null;

		try {
			server = new ServerSocket(5000);
			Socket client = server.accept();
			dis = new DataInputStream(client.getInputStream());
			pw = new PrintWriter(client.getOutputStream());

			int ea = dis.readInt();
			String result = "";
			Random r = new Random();

			while (ea > 0) {
				HashSet<Integer> set = new HashSet<Integer>();
				while (set.size() != 6) {
					set.add(r.nextInt(45) + 1);
				}
				result += ea + "set:" + set.toString() + "\t";
				ea--;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (dis != null)
					dis.close();
				if (pw != null)
					pw.close();
				if (server != null)
					server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
