package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTeST2 {
//입력받은 점수 이상의 학생목록 조회
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료");
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","jina","tiger");
			System.out.println("DB 접속 완료");
			String score = null;
			Scanner sc = new Scanner(System.in);
			System.out.print("점수입력 : ");
			score = sc.nextLine(); //sql문으로 넘어가는 것이기 때문에 숫자여도 string으로 사용해도 된다.
			
			String sql = "select sno, sname, major_no, score from student where score > " + score;
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) { 
				System.out.println(rs.getString(1)+" "+rs.getString("sname")+" " 
			+ rs.getInt(3) + " "+ rs.getDouble("score"));			
			}
			

			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
