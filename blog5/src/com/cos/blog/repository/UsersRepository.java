package com.cos.blog.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cos.blog.db.DBConn;
import com.cos.blog.model.Users;

public class UsersRepository {
	private static final String TAG ="UsersRepository :";
	private static UsersRepository instance = new UsersRepository();
	public static UsersRepository getInstance() {
		return instance;
	}
	private Connection conn;
	private PreparedStatement pstmt= null;
	private ResultSet rs= null;

	public int save(Users user) {
		final String SQL ="insert into users(id,username,password,email,address,userrole,createdate) values(USERS_SEQ.nextval,?,?,?,?,?,sysdate)";
	try {
		conn = DBConn.getConnection();
		pstmt = conn.prepareStatement(SQL);
	pstmt.setString(1, user.getUsername());
	pstmt.setString(2, user.getPassword());
	pstmt.setString(3, user.getEmail());
	pstmt.setString(4, user.getAddress());
	pstmt.setString(5, user.getUserrole());

	return pstmt.executeUpdate();

	} catch (Exception e) {
		// TODO: handle exception
	}
	return -1;

	}
	public Users findByUsernameAndPassword(String username,String password) {
		final String SQL ="select id,username,email,address,userProfile,userRole,createDate From users where username=? AND password=?";
		Users user = null;
		try {
			conn = DBConn.getConnection();
			pstmt= conn.prepareStatement(SQL);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				user = new Users();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setAddress(rs.getString("address"));
				user.setUserprofile("userProfile");
				user.setUserrole(rs.getString("createDate"));
			}
			return user;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findByUsernameAndPassword :"+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt);
		}
		return null;
	}

	public int update(Users user) {
		final String SQL ="";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			return pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG +"update :"+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt);
		}
		return -1;
	}
	public int deleteById(int id) {
		final String SQL ="";

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기

			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"deleteById : "+e.getMessage());

		} finally {
			DBConn.close(conn, pstmt);
		}

		return -1;
	}
	public List<Users> findAll(){
		final  String SQL ="";
		List<Users> users = new ArrayList<>();
		try {
			conn =DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);

			return users;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findAll :"+e.getMessage());
		}finally {
			DBConn.close(conn, pstmt,rs);
		}
		return null;
	}
	public Users findById(int id) {
		final String SQL ="";
		Users user = new Users();

		try {
			conn = DBConn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			// 물음표 완성하기

			// if 돌려서 rs -> java 오브젝트에 집어넣기

			return user;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG+"findById : "+e.getMessage());

		} finally {
			DBConn.close(conn, pstmt ,rs);
		}

		return null;
	}

}