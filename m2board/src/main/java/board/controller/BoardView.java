package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardView extends AbstractController{
	private static Logger logger = Logger.getLogger(BoardView.class);

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
		
		int no =Integer.parseInt( request.getParameter("no"));
		BoardDao boardDao = BoardDao.getInstance();
		boolean result=boardDao.updateReadCount(no);
		BoardDto boardDto = boardDao.getBoardView(no);
		
		logger.info(boardDto);
		
		if(boardDto!=null) {
			return new ModelAndView("/WEB-INF/board/content.jsp","boardDto",boardDto);
		}
		else {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", "글이 삭제되었습니다.");
			mav.addObject("url", "BoardList.do");
			return mav;
		}
		
	}

}
