package com.cos.blog.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.action.Action;
import com.cos.blog.action.user.UsersJoinAction;

//주소를 받기위해서 서블릿으로함 jsp로도 되지만 jsp로하면 보안 씹창남
@WebServlet("/Users")
public class UsersController extends HttpServlet {
	private final static String TAG = "UsersController :";
	private static final long serialVersionUID = 1L;

	public UsersController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
		//왜여기 doProcess를 넣엇을까?
		//이유 알아보기

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
		//왜여기 doProcess를 넣엇을까?
		//이유 알아보기
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// http://localhost:8000/blog/user?cmd=join
		String cmd = request.getParameter("cmd");
		System.out.println(TAG+"router : "+cmd);
		Action action = router(cmd);
		action.execute(request, response);
	}
	public Action router(String cmd) {
		if(cmd.equals("join")) {
			return new UsersJoinAction();
		}else if(cmd.equals("updateProc")) {
			return new UsersJoinAction();
		}
		return null;

	}

}
