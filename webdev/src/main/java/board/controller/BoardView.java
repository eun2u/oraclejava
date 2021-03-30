package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardView extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		Long no = Long.parseLong(request.getParameter("no"));
		
		BoardDao boardDao = BoardDao.getInstance();
		
		if(boardDao.updateReadcount(no)) {
			BoardDto boardDto = boardDao.getBoardView(no);
			boardDto.setContent(boardDto.getContent().replace("\n", "<br/>"));
			return new ModelAndView("/WEB-INF/board/content.jsp","boardDto",boardDto);
		}else {
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", no+"번 게시물이 존재하지 않습니다.");
			mav.addObject("url", "BoardList.do");
			return mav;
		}
	}
	
}
