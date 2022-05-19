package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTeST3 {
//학생이름 일부분 입력 받아서 입력받은 문자열을 포함하는 학생들을 조회 (sname like '%문자열%')
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩완료");
			Connection conn = 
					DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","jina","tiger");
			System.out.println("DB 접속 완료");
			String name = null;
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 입력 : ");
			name = sc.nextLine(); 
//s1		String sql = "select sno, sname, major_no, score from student where sname like '%" + name + "%'";
			String sql = "select sno, sname, major_no, score from student where sname like '%'|| ? || '%'"; //?에 문자열 들어갈 것
			PreparedStatement stmt = conn.prepareStatement(sql); //?에 넣기 -> preparedstatement
			stmt.setString(1, name); //(몇번째 ?에 넣을것인지 index, 넣을 문자열) , 타입 알아서 설정해주기 때문에 ? 에 '' 할 필요 없음
			ResultSet rs = stmt.executeQuery(); //(str) 넣으면 새로 등록되기 때문에 빼야함
			
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
