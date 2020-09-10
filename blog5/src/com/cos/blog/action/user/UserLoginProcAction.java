package com.cos.blog.action.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.blog.action.Action;
import com.cos.blog.model.Users;
import com.cos.blog.repository.UsersRepository;

public class UserLoginProcAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(
				request.getParameter("username").equals("")||
				request.getParameter("username")==null ||
				request.getParameter("password").equals("")||
				request.getParameter("password")==null
		) {
			return;
		}
		String username= request.getParameter("username");
		String password= request.getParameter("password");

		UsersRepository usersRepository = UsersRepository.getInstance();
		//이미 싱글톤으로 New가 떠잇다
		Users user = usersRepository.findByUsernameAndPassword(username, password);

	}

}
