package board.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	private Logger logger = Logger.getLogger(DispatcherServlet.class);
	private Map<String, AbstractController> actionMap = new HashMap<String, AbstractController>();
	
	public DispatcherServlet() {
	//	System.out.println("DispatcherServlet 생성");
	}
	private void destory() {
		//System.out.println("destroy() 메소드 수행");
	}
	
	
	@Override
	public void init() throws ServletException {
		//System.out.println("init() 메소드 수행");
		
		String props=this.getClass().getResource("dispatcher.properties").getPath();
		Properties pr = new Properties();
		FileInputStream f=null;
		
		try {
			f=new FileInputStream(props);
			pr.load(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Object obj : pr.keySet()) {
			String key = ((String) obj).trim();				 //예) /BoardInsert.do
			String className = (pr.getProperty(key)).trim(); //예) board.controller.boardInsert
			
			try {
				Class<?> actionClass = Class.forName(className);
				AbstractController controller = (AbstractController) actionClass.getConstructor().newInstance();
				actionMap.put(key, controller);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	System.out.println("service() 메소드 수행");
		String requestURI = request.getRequestURI();
		String action = requestURI.substring(request.getContextPath().length());
		logger.info(action);
		
		AbstractController controller = null;
		ModelAndView mav = null; //다음 이동할 view의 경로와 그 view에 뿌려줄 데이터를 포함
		

		controller = actionMap.get(action);
		mav=controller.handleRequestInternal(request, response);
		
		
		if(mav!=null) {
			String viewName = mav.getViewName();
			if(viewName.startsWith("redirect:")) {
				response.sendRedirect(viewName.substring("redirect:".length()));
				return;
			}
			
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
