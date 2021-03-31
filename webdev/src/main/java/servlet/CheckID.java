package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class CheckID extends HttpServlet {
	private static Logger logger = Logger.getLogger(CheckID.class);
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		logger.info("id : "+id);
		
		UserDao userDao =UserDao.getInstance();
		int count=userDao.countID(id);
		logger.info("cnt : "+count);
		
		request.setAttribute("count", count);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ajax01/checkid.jsp");
		dispatcher.forward(request, response);
		
	}
}
