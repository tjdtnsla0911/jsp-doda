package Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import myblog.db.DBConn;
import myblog.model.fruitshop;

public class BoardRepository {
	private static BoardRepository instance = new BoardRepository();
	private BoardRepository() {

	}
	public static BoardRepository getInstance() {
		return instance;
	}

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public List<fruitshop> findAll(){
		final String SQL="select * from FRUITSHOP";
		List<fruitshop> fruitshops = new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				fruitshop fruitshopss = new fruitshop(
						rs.getInt("FRUITNUMBER"),
						rs.getString("FRUIT"),
						rs.getString("KIND"),
						rs.getInt("PRICE"),
						rs.getInt("SALES")


				);
				fruitshops.add(fruitshopss);


				System.out.println("fruit의 결과 = "+fruitshops);

			}
			return fruitshops;




		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConn.close(conn, pstmt, rs);
		}
		return null;
	}

	public List<fruitshop> FindOrderBy(){
		final String SQL="select * from FRUITSHOP order by price asc";
		List<fruitshop> fruitshops = new ArrayList<>();


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				fruitshop fruitshopss = new fruitshop(
						rs.getInt("FRUITNUMBER"),
						rs.getString("FRUIT"),
						rs.getString("KIND"),
						rs.getInt("PRICE"),
						rs.getInt("SALES")


				);
				fruitshops.add(fruitshopss);


				System.out.println("fruit의 결과 = "+fruitshops);

			}
			return fruitshops;
			




		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBConn.close(conn, pstmt, rs);
		}
		return null;
	}
}



