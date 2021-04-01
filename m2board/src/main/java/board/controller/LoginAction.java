package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import board.model.MemberDao;
import board.model.MemberDto;

public class LoginAction extends AbstractController {
	private static Logger logger = Logger.getLogger(LoginAction.class);
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String id= request.getParameter("id");
		String password= request.getParameter("password");
		
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		memberDto.setPassword(password);
		
		logger.info(memberDto);
		MemberDao memberDao = MemberDao.getInstance();
		MemberDto userInfo = memberDao.getUser(memberDto);
		
		if(userInfo!= null) { //로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("userInfo", userInfo);
			
			return new ModelAndView("redirect:BoardList.do");
		}else { //로그인 실패
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "아이디 혹은 패스워드가 틀립니다.");
			mav.addObject("url", "Login.do");
			
			return mav;
		}
	}

}
