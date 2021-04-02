package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import board.model.BoardDao;
import board.model.BoardDto;
import board.model.MemberDto;

public class BoardList extends AbstractController{
	private static Logger logger = Logger.getLogger(BoardList.class);

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
		
		Long pg = 1L; //pg값이 넘어오지 않을 때 디폴트 값
		if(request.getParameter("pg")!=null) {
			pg=Long.parseLong(request.getParameter("pg"));
		}
		int pageSize=10;					//한 페이지의 게시물 수
		long startnum=(pg-1)*pageSize +1;	// 페에지의 시작번호
		long endnum=pg*pageSize;			//페이지의 끝번호
		
		
		String logInfo=userInfo.getName() + "(" + userInfo.getId()+") 님이 로그인하였습니다.";
		BoardDao boardDao = BoardDao.getInstance();
		long recordCount = boardDao.getRecordCount(); //전체 레코드수
		long pageCount=recordCount/pageSize ; //전체 페이지 수 
		if(recordCount%pageSize !=0) 	pageCount++;
		
		int blockSize=10;										//힌 블럭의 페이지수
		long startPage=(pg-1)/blockSize * blockSize +1;			//현재블럭의 첫페이지
		long endPage=(pg-1)/blockSize *blockSize +blockSize;	//현재 블럭의 마지막페이지
		if(endPage > pageCount) endPage=pageCount;
	 	
		List<BoardDto> list = boardDao.getBoardList(startnum, endnum);
		
		ModelAndView mav = new ModelAndView("/WEB-INF/board/list.jsp");
		mav.addObject("logInfo", logInfo);
		mav.addObject("list", list);
		mav.addObject("pageCount", pageCount);
		mav.addObject("pg", pg);
		mav.addObject("startPage", startPage);
		mav.addObject("endPage", endPage);
		return mav;
	}

}
