package board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import board.model.MemberDao;
import board.model.MemberDto;

public class MemberRegisterAction extends AbstractController {
	private static Logger logger = Logger.getLogger(MemberRegisterAction.class);
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("user_id");
		String password = request.getParameter("user_pw");
		String name = request.getParameter("user_name");
		String birth = request.getParameter("user_birth");
		String phone = request.getParameter("user_phone");
		String zipcode = request.getParameter("zipcode");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		
		MemberDto memberDto = new MemberDto();
		memberDto.setId(id);
		memberDto.setPassword(password);
		memberDto.setName(name);
		memberDto.setBirth(birth);
		memberDto.setPhone(phone);
		memberDto.setZipcode(zipcode);
		memberDto.setAddress1(address1);
		memberDto.setAddress2(address2);
		
		logger.info(memberDto);
		MemberDao memberDao = MemberDao.getInstance();
		boolean result = memberDao.registerMember(memberDto);
		
		if(result) { //회원등록 성공
			return new ModelAndView("/WEB-INF/board/success.jsp","memberDto",memberDto);
		}else { //회원등록 실패
			ModelAndView mav = new ModelAndView("/WEB-INF/board/result.jsp");
			mav.addObject("msg", id+ " 회원 등록에 실패하였습니다.");
			mav.addObject("url", "javascript:history.back();");
			return mav;
		}
	}

}
