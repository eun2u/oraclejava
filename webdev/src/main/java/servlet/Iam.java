package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class Iam extends HttpServlet {
	private static Logger logger = Logger.getLogger(Iam.class);
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		int age =Integer.parseInt(request.getParameter("age"));
		logger.info("name : "+name + ", age : " + age);
		
		String iam = say(name,age);
		
		request.setAttribute("iam", iam);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ajax01/iam2.jsp");
		dispatcher.forward(request, response);
	}

	private String say(String name, int age) {
		String msg = null;
		
		if(name.equals("송태섭")){
			msg = "그래 난 "+age+"세, "+ name + " 넘버1 가드!";
		}else if(name.equals("서태웅")){
			msg = "그래 난 "+ name +age+"세, "+ " 북산 농구팀 에이스!!!";
		}else if(name.equals("강백호")){
			msg = "멍청이!!";
		}else{
			msg="그래 난 "+ name+ age+"세, "+", 가끔은 포기하는 남자지 ...";
		}
		
		return msg;
	}
}
