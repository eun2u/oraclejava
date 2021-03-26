package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();  
		out.println("<html>");
		out.println("<head><title>test servlet</title></head>");
		out.println("<body><h1>안녕하세요 " + name+"(SERVICE)</h1></body></html>");
		out.close();
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		response.setContentType("text/html;charset=UTF-8");//(브라우저)에 말하는 것
		//위에 한줄과 밑에 두줄이 같은 것.
//		response.setContentType("text/html");
//		response.setCharacterEncoding("UTF-8");
		
		
		PrintWriter out = response.getWriter(); //문자열을 출력하기 위한 스트림 
		out.println("<html>");
		out.println("<head><title>test servlet</title></head>");
		out.println("<body><h1>안녕하세요 " + name+"(GET)</h1></body></html>");
		out.close();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		response.setContentType("text/html;charset=UTF-8");
			
		PrintWriter out = response.getWriter(); //문자열을 출력하기 위한 스트림 
		out.println("<html>");
		out.println("<head><title>test servlet</title></head>");
		out.println("<body><h1>안녕하세요 " + name+"(POST)</h1></body></html>");
		out.close();
	}


}
