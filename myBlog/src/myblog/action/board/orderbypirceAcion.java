package myblog.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import Repository.BoardRepository;
import myblog.action.Action;
import myblog.model.fruitshop;

public class orderbypirceAcion implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result =1;
		BoardRepository boardRepository = BoardRepository.getInstance();
		List<fruitshop> findOrderBy = boardRepository.FindOrderBy();


		request.setAttribute("findOrderBy", findOrderBy);
		System.out.println("여기도 안쳐나왓겟지? ="+findOrderBy);


		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);


	}

}
