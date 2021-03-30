package test.mvc;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BasketList {

	public String getBasketList(HttpServletRequest request, HttpServletResponse response) {
		List<BasketMember> list = new ArrayList<BasketMember>();
		list.add(new BasketMember("서태웅", "스몰포워드", 11, 30.1));
		list.add(new BasketMember("강백호", "파워포워드", 10, 7.0));
		list.add(new BasketMember("채치수", "센터", 4, 25.0));
		list.add(new BasketMember("정대만", "슈팅가드", 14, 27.1));
		
		request.setAttribute("list", list);
		
		return "/WEB-INF/view/basket.jsp";
	}
}
