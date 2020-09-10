package myblog.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import myblog.action.Action;
import myblog.action.board.fruitHomeAction;
import myblog.action.board.orderbypirceAcion;


@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardController() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd =request.getParameter("cmd");
		Action action = router(cmd);
		action.execute(request, response);


	}
	public Action router(String cmd) {
		if(cmd.equals("home")) {
			return new fruitHomeAction();
		}else if(cmd.equals("orderbypirce")) {
			return new orderbypirceAcion();
		}
		return null;
	}


}
