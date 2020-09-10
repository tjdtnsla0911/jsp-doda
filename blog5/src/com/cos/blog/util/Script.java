package com.cos.blog.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {
	public static void back(String msg,HttpServletResponse response) {
		PrintWriter out;
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=utf-8");

			out = response.getWriter();
			out.print("<script>");
			out.print("alert('"+msg+"')");
			out.print("history.back();");
			out.print("</script>");
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	public static void href(String msg,String uri,HttpServletResponse response) {
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alrt('"+msg+"');");
			out.print("location.href='"+uri+"'");
			out.print("</script>");
			} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
