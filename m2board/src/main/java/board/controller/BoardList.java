package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.MemberDto;

public class BoardList extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberDto userInfo = (MemberDto) session.getAttribute("userInfo");
		
		if(userInfo == null) { //세션에 정보가 없을 경우(로그인하지 않았거나 이미 로그아웃한 경우)
			ModelAndView mav = new ModelAndView("WEB-INF/board/result.jsp");
			mav.addObject("msg", "먼저 로그인하셔야 합니다.");
			mav.addObject("url", "Login.do");
			return mav;
		}
		
		String logInfo=userInfo.getName() + "(" + userInfo.getId()+") 님이 로그인하였습니다.";
		
		ModelAndView mav = new ModelAndView("/WEB-INF/board/list.jsp");
		mav.addObject("logInfo", logInfo);
		return mav;
	}

}
