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

public class OrderpriceAciton implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int result;
		BoardRepository boardRepository = BoardRepository.getInstance();
		result=boardRepository.order(1);
		System.out.println("result값은 ? ="+result);
		request.setAttribute("result", result);

		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);



	}

}
