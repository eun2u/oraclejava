package board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.MemberDao;
import board.model.ZipcodeDto;

public class Zipcode extends AbstractController{
	private static Logger logger = Logger.getLogger(Zipcode.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String area = request.getParameter("area");
		logger.info("area: "+area);
		
		
		if(area==null) { // 최초 주소 찾기 화면 띄울 때
			return new ModelAndView("/WEB-INF/board/zipcode.jsp");
			
		}else { //동이름 검색시
			MemberDao memberDao = MemberDao.getInstance();
			List<ZipcodeDto> list = memberDao.searchZipcode(area); //주소리스트얻어오기
			
//			for(ZipcodeDto dto : list) {
//				logger.info(dto);
//			}
			ModelAndView mav = new ModelAndView("/WEB-INF/board/zipcode.jsp");
			mav.addObject("list", list);
			mav.addObject("area", area);
			
			return mav;
			
		}
	}
}
