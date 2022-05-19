package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {

		//1. Driver Load
		//2. DB Connect
		//3. SQL Generate
		//4. create Statement (SQL 실행 인터페이스)
		//5. execute SQL
		//6. close
		
		try {
			//1. Driver Load
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료");
			//2. DB Connect (접속 url)
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","jina","tiger");
			System.out.println("DB 접속 완료");
			//3. SQL Generate
			String sql = "select sno, sname, major_no, score from student"; //sql문에 세미콜론x
			//4. create Statement (SQL 실행 인터페이스)
			Statement stmt = conn.createStatement();
			//5. execute SQL 
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) { 
				System.out.println(rs.getString(1)+" "+rs.getString("sname")+" " 
			+ rs.getInt(3) + " "+ rs.getDouble("score")); // () 안에는 컬럼번호 or "컬럼명" 
			}
			//6. close
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
