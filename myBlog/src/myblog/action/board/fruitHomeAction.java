package myblog.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Repository.BoardRepository;
import myblog.action.Action;
import myblog.model.fruitshop;

public class fruitHomeAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BoardRepository boardRepository = BoardRepository.getInstance();
		List<fruitshop> fruitshops = boardRepository.findAll();

		request.setAttribute("fruitshops", fruitshops);


		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);



	}


}
