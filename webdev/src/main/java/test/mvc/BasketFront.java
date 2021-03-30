package test.mvc;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasketFront extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BasketList list = new BasketList();
		ModelAndView mav =list.getBasketList(request,response);
		
		Map<String, Object> model = mav.getModel();
		
		for(String key: model.keySet()) {
			request.setAttribute(key, model.get(key));
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(mav.getViewName());
		dispatcher.forward(request, response);
	}
}
