package com.cos.blog.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cos.blog.db.DBConn;
import com.cos.blog.model.Reply;

public class ReplyRepository {
	private static final String TAG ="ReplyRepository :";
	private static ReplyRepository instance = new ReplyRepository();
	private ReplyRepository(){}
	public static ReplyRepository getinstance() {
		return instance;
	}
	private Connection conn=null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private int save(Reply reply) {
		final String SQL="";
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG +"save : "+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public int update(Reply reply) {
		final String SQL="";
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "update :"+e.getMessage());
		}
		return -1;
	}
	public int deleteById(int id) {
		final String SQL ="";
		try {
			conn =DBConn.getConnection();
			pstmt =conn.prepareStatement(SQL);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "deleteById :"+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public Reply findById(int id) {
		final String SQL="";
		Reply reply =new Reply();
		try {
			conn =DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			return reply;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG +"findById :"+e.getMessage());

		}
		return null;
	}



}
