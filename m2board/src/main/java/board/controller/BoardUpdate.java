package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.controller.AbstractController;
import board.controller.ModelAndView;
import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardUpdate extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberDto userInfo = (MemberDto) session.getAttribute("userInfo");
		
		if(userInfo == null) { //세션에 정보가 없을 경우(로그인하지 않았거나 이미 로그아웃한 경우)
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "먼저 로그인하셔야 합니다.");
			mav.addObject("url", "Login.do");
			return mav;
		}
		
		Long no=Long.parseLong(request.getParameter("no"));
		
		BoardDao boardDao=BoardDao.getInstance();
		BoardDto boardDto= boardDao.getBoardView(no);
		
		return new ModelAndView("/WEB-INF/board/update.jsp","boardDto" ,boardDto);
		
	}
	
}
