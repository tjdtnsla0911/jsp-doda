package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnetion {
	//DB연결
	public static Connection getConnection() {
		try {

			String driver="jdbc:oracle:thin:@localhost:1521:xe";
			Class.forName("oracle.jdbc.driver.OracleDriver");//우리가 안가지고있는 클래스를가져온다

			Connection conn= DriverManager.getConnection(driver,"ssar","BITC5600");
			return conn;

		} catch (Exception e) {
			System.out.println("디비연결에러 :"+e.getMessage());

		}
		return null;

	}

	//디비종료
	public static void close(Connection conn,PreparedStatement pstmt,ResultSet rs) {
		try {
			if(conn != null) {
				conn.close();
			}
			if(pstmt !=null) {
				pstmt.close();
			}
			if(rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			System.out.println("디비종료에러 :"+e.getMessage());
		}
	}


}
