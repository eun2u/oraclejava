package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.MemberDao;

public class CheckID extends AbstractController {
	private static Logger logger = Logger.getLogger(CheckID.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String id=request.getParameter("user_id");
		logger.info("id : "+ id);
		
		MemberDao memberDao = MemberDao.getInstance();
		int count = memberDao.checkId(id);
		logger.info("count : "+ count);
		
		return new ModelAndView("/WEB-INF/board/checkid.jsp","count",count);
	}

}
