<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	String msg = null;
	
	if(name.equals("송태섭")){
		msg = "그래 난 "+ name + " 넘버1 가드!";
	}else if(name.equals("서태웅")){
		msg = "그래 난 "+ name + " 북산 농구팀 에이스!!!";
	}else if(name.equals("강백호")){
		msg = "멍청이!!";
	}else{
		msg="그래 난 "+ name+ ", 가끔은 포기하는 남자지 ...";
	}
%>
<%=msg %>