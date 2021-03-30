package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardUpdateAction extends AbstractController {
	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		Logger logger = Logger.getLogger(BoardUpdateAction.class);
		
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
		boolean result = boardDao.updateBoard(boardDto);
		
		ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
		if(result) {
			return new ModelAndView("redirect:BoardList.do");
		}else {
			mav.addObject("msg", "글 수정 실패");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
		
	}
}
