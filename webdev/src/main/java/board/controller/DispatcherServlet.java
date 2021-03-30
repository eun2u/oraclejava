package board.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class DispatcherServlet extends HttpServlet {
	private Logger logger = Logger.getLogger(DispatcherServlet.class);
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String action = requestURI.substring(request.getContextPath().length());
		logger.info(requestURI);
		
		AbstractController controller = null;
		ModelAndView mav = null; //다음 이동할 view의 경로와 그 view에 뿌려줄 데이터를 포함
		
		if(action.equals("/BoardInsert.do")) {
			controller = new BoardInsert();
			mav=controller.handleRequestInternal(request, response);
		}else if(action.equals("/BoardInsertAction.do")) {
			controller = new BoardInsertAction();
			mav=controller.handleRequestInternal(request, response);
		}
		
		if(mav!=null) {
			Map<String, Object> model = mav.getModel();
			
			for(String key: model.keySet()) {
				request.setAttribute(key, model.get(key));
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher(mav.getViewName());
			dispatcher.forward(request, response);
		}else {
			logger.info("DispatcherServlet에서 길을 잃었다네..");
		}
		
	}
}
