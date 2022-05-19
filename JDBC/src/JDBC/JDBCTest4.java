package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest4 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","jina","tiger");
			String sql = "insert into student(sno, sname,major_no,score) values(?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			conn.setAutoCommit(false); //자동 커밋 해제
			stmt.setString(1, "21334232");
			stmt.setString(2, "김길동");
			stmt.setInt(3, 13); //setString(3,"22") 해도 된다
			stmt.setDouble(4, 4.0);
			
			int count = stmt.executeUpdate(); //업데이트 횟수
			System.out.println(count+"건 적용되었습니다.");
			
			conn.commit(); //커밋
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
