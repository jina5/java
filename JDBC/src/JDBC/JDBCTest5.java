package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.internal.OracleTypes;


public class JDBCTest5 {

	public static void main(String[] args) {
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료");
			
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","jina","tiger");
			System.out.println("DB 접속 완료");
			String sql = "{call insert_student(?,?,?,?,?)}";
			CallableStatement stmt = conn.prepareCall(sql);
			stmt.setString(1, "1CC1");
			stmt.setString(2, "EEE");
			stmt.setInt(3, 21);
			stmt.setDouble(4, 3.1);
			stmt.registerOutParameter(5, OracleTypes.NUMBER);
			stmt.execute();
			System.out.println(stmt.getInt(5));
			
			stmt.close();
			conn.clearWarnings();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
