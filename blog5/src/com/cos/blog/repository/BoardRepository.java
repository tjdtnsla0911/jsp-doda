package com.cos.blog.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cos.blog.db.DBConn;
import com.cos.blog.model.Board;

public class BoardRepository {
	private static final String TAG = "BoardRepository :";
	private static BoardRepository instance = new BoardRepository();
	private BoardRepository() {}
	public static BoardRepository getInstance() {
		return instance;
	}
	private Connection conn = null;
	private PreparedStatement pstmt =null;
	private ResultSet rs = null;

	public int save(Board board) {
		final String SQL="";
		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			return pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG +"save : "+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public int update(Board board) {
		final String SQL="";
		try {
			conn = DBConn.getConnection();
			pstmt=conn.prepareStatement(SQL);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"update :"+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public int deleteById(int id) {
		final String SQL ="";
		try {
			conn = DBConn.getConnection();
			pstmt=conn.prepareStatement(SQL);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"deleteById :"+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public List<Board> findAll() {
		final String SQL ="";
		List<Board> boards = new ArrayList<>();

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기

			// while 돌려서 rs -> java 오브젝트에 집어넣기

			return boards;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findAll : "+e.getMessage());

		} finally {
			DBConn.close(conn, pstmt ,rs);
		}

		return null;
	}

	public Board findById(int id) {
		final String SQL ="";
		Board board = new Board();

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기

			// if 돌려서 rs -> java 오브젝트에 집어넣기

			return board;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findById : "+e.getMessage());

		} finally {
			DBConn.close(conn, pstmt ,rs);
		}

		return null;
	}
}
