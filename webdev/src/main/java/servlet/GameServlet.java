package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int you=Integer.parseInt(request.getParameter("you"));
		int com=(int)(Math.random()*3)+1;
		
		request.setAttribute("you", whatMethod(you));
		request.setAttribute("com", whatMethod(com));
		
		int result=whatResult(you, com);
		if(result==0)
			request.setAttribute("result", "무승부입니다.");
		else if(result==1)
			request.setAttribute("result", "이겼습니다.");
		else if(result==-1)
			request.setAttribute("result", "졌습니다.");
		else
			request.setAttribute("result", "다시 시도하세요.");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/game/game_action.jsp");
		dispatcher.forward(request,response);
		
	}
	public String whatMethod(int key){
		switch(key){
		case 1: return "가위";
		case 2: return "바위";
		case 3: return "보";
		default: return "에러";
		}
	}
	public int whatResult(int you, int com) {
		if(you==1) { //가위
			switch(com) {
			case 1: return 0;
			case 2: return -1;
			case 3: return 1;
			}
		}
		else if(you==2) { //바위
			switch(com) {
			case 1: return 1;
			case 2: return 0;
			case 3: return -1;
			}
		}
		else if(you==3) { //보
			switch(com) {
			case 1: return -1;
			case 2: return 1;
			case 3: return 0;
			}
		}
		return -2;
	}
}
