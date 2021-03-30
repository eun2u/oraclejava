package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.BoardDao;
import board.model.BoardDto;

public class BoardDelete extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		BoardDao boardDao = BoardDao.getInstance();
		BoardDto boardDto = boardDao.getBoardView(Long.parseLong(request.getParameter("no")) );
		
		return new ModelAndView("/WEB-INF/board/delete.jsp", "boardDto", boardDto);
	}

}
