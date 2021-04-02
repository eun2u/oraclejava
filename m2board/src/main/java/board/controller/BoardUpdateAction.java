package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardUpdateAction extends AbstractController{
	private static Logger logger = Logger.getLogger(BoardUpdateAction.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		MemberDto userInfo = (MemberDto) session.getAttribute("userInfo");
		
		if(userInfo == null) { 
			ModelAndView mav = new ModelAndView("WEB-INF/board/result.jsp");
			mav.addObject("msg", "먼저 로그인하셔야 합니다.");
			mav.addObject("url", "Login.do");
			return mav;
		}
		
		
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		Long no = Long.parseLong(request.getParameter("no"));
		String id =userInfo.getId();
		
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		
		
		BoardDto boardDto = new BoardDto();
		boardDto.setNo(no);
		boardDto.setTitle(title);
		boardDto.setContent(content);
		boardDto.setMemberDto(memberDto);
		
		logger.info(boardDto);
		
		BoardDao boardDao = BoardDao.getInstance();
		boolean result = boardDao.updateBoard(boardDto);
		
		if(result) {
			return new ModelAndView("redirect:BoardView.do?no="+boardDto.getNo());
			
		}else {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg","글 수정 실패!!" );
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
		
	}

}
