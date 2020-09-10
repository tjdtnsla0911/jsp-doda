package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnetion;
import model.Drugstore;

public class DrugstoreDao {
	private final static String TAG = "DrugstoreDao";

	private static DrugstoreDao instance = new DrugstoreDao();

	public static DrugstoreDao getInstance() {
		return instance;
	}
	public DrugstoreDao() {

	}
	public Drugstore getFirstLine() {
		String SQL = "SELECT * FROM drugstore";
		Connection conn = null;//선언만해도 문제는없는데 null로하는게 더안전하다함
		PreparedStatement pstmt=null;
		ResultSet rs= null;
		Drugstore ds = null;
		
		try {
			conn = DBConnetion.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs= pstmt.executeQuery();

			if(rs.next()) {
				ds = new Drugstore(rs.getString(1),rs.getString(2));
			}
			return ds;
		} catch (Exception e) {
			System.out.println(TAG + e.getMessage());
		}finally{
			DBConnetion.close(conn,pstmt,rs);

		}

		return null;
	}
	public static void main(String[] args) {
		System.out.println(DrugstoreDao.getInstance().getFirstLine());
	}
}
