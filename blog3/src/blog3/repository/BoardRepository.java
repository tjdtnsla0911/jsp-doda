package blog3.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import blog3.db.DBConn;
import blog3.model.Fruit;

public class BoardRepository {
	private static final String TAG = "BoardRepository : ";
	private static BoardRepository instance = new BoardRepository();

	private BoardRepository() {
	}

	public static BoardRepository getInstance() {
		return instance;
	}

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public List<Fruit> findAll() {
		final String SQL = "SELECT * from FRUITSHOP";
		List<Fruit> fruit = new ArrayList<>();

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// while 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Fruit fruits = new Fruit(
						rs.getInt("FRUITNUMBER"),
						rs.getString("name"),
						rs.getString("kind"),
						rs.getInt("price"),
						rs.getInt("sales")
						);
				fruit.add(fruits);
				System.out.println("값은제대로 받앗네 ? ="+fruit);
			}

			return fruit;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findAll : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return null;
	}
	public int order(int result) {
		final String SQL = "SELECT * from FRUITSHOP order by price asc";


		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// while 돌려서 rs -> java오브젝트에 집어넣기
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Fruit fruits = new Fruit(
						rs.getInt("FRUITNUMBER"),
						rs.getString("name"),
						rs.getString("kind"),
						rs.getInt("price"),
						rs.getInt("sales")
						);


			}
			return result;




		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findAll : " + e.getMessage());
		} finally {
			DBConn.close(conn, pstmt, rs);
		}

		return -1;
	}

}
