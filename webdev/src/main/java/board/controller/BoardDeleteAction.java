package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardDeleteAction extends AbstractController {
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		Logger logger = Logger.getLogger(BoardDeleteAction.class);
		
		Long no = Long.parseLong(request.getParameter("no"));
		String title = request.getParameter("title");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String content = request.getParameter("content");

		BoardDto boardDto=new BoardDto();
		boardDto.setNo(no);
		boardDto.setTitle(title);
		boardDto.setName(name);
		boardDto.setPassword(password);
		boardDto.setContent(content);
		
		logger.info(boardDto);
		
		BoardDao boardDao = BoardDao.getInstance();
		boolean result = boardDao.deleteBoard(boardDto);
		
		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		if(result) {
			mav.addObject("msg", no+"번 게시물이 삭제되었습니다.");
			mav.addObject("url", "BoardList.do");
		}else {
			mav.addObject("msg", "비밀번호가 틀립니다.");
			mav.addObject("url", "javascript:history.back();");
		}
		return mav;

	}
}
