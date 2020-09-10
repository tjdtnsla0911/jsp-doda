package com.cos.blog.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConn {
	public static Connection getConnection() {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			Connection conn= ds.getConnection();
			System.out.println("DBConn : DBデータ連携成功！");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DBConn : DBデータ連携失敗しました！");
			System.out.println("DBConn : Messge : "+e.getMessage());
		}
		return null;
	}
	public static void close(Connection conn,PreparedStatement pstmt) {
		try {
			conn.close();
			pstmt.close();
		} catch (Exception e) {
			System.out.println("DB終了失敗！"+e.getMessage());
		}
	}
	public static void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			conn.close();
			pstmt.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("DB終了失敗！"+e.getMessage());
		}
	}

}
