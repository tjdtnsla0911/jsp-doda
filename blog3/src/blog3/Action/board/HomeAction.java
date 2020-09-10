package blog3.Action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import blog3.Action.Action;
import blog3.model.Fruit;
import blog3.repository.BoardRepository;

public class HomeAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	BoardRepository boardRepository = BoardRepository.getInstance();

	List<Fruit> fruits = boardRepository.findAll();
	request.setAttribute("fruits", fruits);
	int result=1;
	RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
	dis.forward(request, response);
	}

}
