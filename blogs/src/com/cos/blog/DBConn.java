package com.cos.blog;

import java.sql.Connection;

import javax.activation.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;

public class DBConn {
	public static Connection conn{
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
			Connection conn =

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
